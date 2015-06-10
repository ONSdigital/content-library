package com.github.onsdigital.content.util;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;
import com.google.gson.*;
import org.reflections.Reflections;
import org.reflections.util.ConfigurationBuilder;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by bren on 09/06/15.
 */
class PageTypeResolver implements JsonDeserializer<Page> {

    private static Map<PageType, Class> contentClasses = new HashMap<PageType, Class>();

    static {
        registerContentTypes();
    }

    @Override
    public Page deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement jsonType = jsonObject.get("type");
        String type = jsonType.getAsString();

        try {
            PageType contentType = PageType.valueOf(type);
            Class<Page> contentClass = contentClasses.get(contentType);
            Page content = context.deserialize(json, contentClass);
            return content;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Could find content object for " + type);
        }
    }


    private static void registerContentTypes() {
        System.out.println("Resolving content types");
        try {

            ConfigurationBuilder configurationBuilder = new ConfigurationBuilder().addUrls(PageTypeResolver.class.getProtectionDomain().getCodeSource().getLocation());
            configurationBuilder.addClassLoader(PageTypeResolver.class.getClassLoader());
            Set<Class<? extends Page>> classes = new Reflections(configurationBuilder).getSubTypesOf(Page.class);

            for (Class<? extends Page> contentClass : classes) {
                String className = contentClass.getSimpleName();
                boolean _abstract = Modifier.isAbstract(contentClass.getModifiers());
                if (_abstract) {
                    System.out.println("Skipping registering abstract content type " + className);
                    continue;
                }
                System.out.println("Registering content type: " + className);
                Page contentInstance = contentClass.newInstance();
                contentClasses.put(contentInstance.getType(), contentClass);
            }
        } catch (Exception e) {
            System.err.println("Failed initializing content types");
            throw new RuntimeException("Failed initializing request handlers", e);
        }

    }

}
