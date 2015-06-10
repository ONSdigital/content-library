package com.github.onsdigital.content.serialiser;

import com.github.onsdigital.content.base.Content;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by bren on 06/06/15.
 *
 * Several utilities to serialise/deserialize utility with date format supports.
 *
 * Uses d MMMM yyy as default date format for date fields. (e.g. 1 January 2015, 10 February 2015)
 *
 */
public class ContentUtil {

    private static final String DEFAULT_DATE_PATTERN = "d MMMM yyyy";

    /**
     * Returns json string for given object
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
    public static Content deserialise(InputStream stream) {
        return gson().fromJson(new InputStreamReader(stream), Content.class);
    }

    /**
     * Resolves content type and deserializes automatically to that implementation. Use if you do not need to know actual class implementation
     *
     * @param json
     * @return
     */
    public static Content deserialise(String json) {
        return gson().fromJson(json, Content.class);
    }

    public static <O extends Content> O  deserialise(InputStream stream, Class<O> type) {
        return gson().fromJson(new InputStreamReader(stream), type);
    }


    public static <O extends  Cloneable> O clone(O o) {
        Cloneable cloneable = o;
        return ObjectUtils.clone(o);
    }

    private static Gson gson(String datePattern) {
        GsonBuilder builder = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(Content.class, new ContentTypeResolver());
        if (StringUtils.isNotBlank(datePattern)) {
            builder.setDateFormat(datePattern);
        } else {
            builder.setDateFormat(DEFAULT_DATE_PATTERN);
        }
        return builder.create();
    }

    private static Gson gson() {
        return gson(null);
    }

}
