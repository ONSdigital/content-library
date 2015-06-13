package com.github.onsdigital.content.util;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by bren on 06/06/15.
 * <p>
 * Several utilities to serialise/deserialize utility with date format supports.
 * <p>
 * Uses d MMMM yyy as default date format for date fields. (e.g. 1 January 2015, 10 February 2015)
 */
public class ContentUtil {

    /**
     * Returns json string for given object
     *
     * @return
     */
    public static String serialise(Object object) {
        return gson().toJson(object);
    }

    public static <O extends Object> O deserialise(String json, Class<O> type) {
        return gson().fromJson(json, type);
    }

    /**
     * Resolves content type and deserializes automatically to that implementation. Use if you do not need to know actual class implementation
     *
     * @param stream json stream
     * @return
     */
    public static Page deserialisePage(InputStream stream) {
        return createBuilder(ContentConstants.DEFAULT_DATE_PATTERN).registerTypeAdapter(Page.class, new PageTypeResolver()).create().fromJson(new InputStreamReader(stream), Page.class);
    }


    /**
     * Resolves page type and deserializes automatically to that implementation. Use if you do not need to know actual class implementation
     *
     * @param json
     * @return
     */
    public static Page deserialisePage(String json) {
        return createBuilder(ContentConstants.DEFAULT_DATE_PATTERN).registerTypeAdapter(Page.class, new PageTypeResolver()).create().fromJson(json, Page.class);
    }

    public static <O extends Object> O deserialise(InputStream stream, Class<O> type) {
        return gson().fromJson(new InputStreamReader(stream), type);
    }


    public static <O extends Cloneable> O clone(O o) {
        Cloneable cloneable = o;
        return ObjectUtils.clone(o);
    }

//    public static void initializeMetadata(ContentService contentService, List<PageReference> pageReferences) {
//        if (pageReferences == null) {
//            return;
//        }
//        for (PageReference reference : pageReferences) {
//            initializeMetadata(contentService, reference);
//        }
//    }

    public static void loadReferences(ContentService contentService, List<PageReference> pageReferences) throws ContentNotFoundException {
        if (pageReferences == null) {
            return;
        }
        for (PageReference reference : pageReferences) {
            loadReferences(contentService, reference);
        }
    }

//    public static void initializeMetadata(ContentService contentService, PageReference pageReference) {
//        if (pageReference == null) {
//            return;
//        }
//        pageReference.metadata = ContentUtil.deserialise(getJson(contentService, pageReference), Metadata.class);
//    }

    public static void loadReferences(ContentService contentService, PageReference pageReference) throws ContentNotFoundException {
        if (pageReference == null) {
            return;
        }
        pageReference.data = ContentUtil.deserialisePage(getJson(contentService, pageReference));
    }

    private static InputStream getJson(ContentService contentService, PageReference pageReference) throws ContentNotFoundException {
        //TODO: What happens if referenced content not found ?
//        try {
//        } catch (ContentNotFoundException e) {
//            e.printStackTrace();
//            return null;
//        }
        return contentService.readData(pageReference.getUri().toString());
    }


    private static Gson gson() {
        return gson(null);
    }

    private static Gson gson(String datePattern) {
        GsonBuilder builder = createBuilder(datePattern);
        return builder.create();
    }

    private static GsonBuilder createBuilder(String datePattern) {
        GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
        if (StringUtils.isNotBlank(datePattern)) {
            builder.setDateFormat(datePattern);
        } else {
            builder.setDateFormat(ContentConstants.DEFAULT_DATE_PATTERN);
        }
        return builder;
    }

}
