package com.github.onsdigital.content.serialiser;

import com.github.onsdigital.content.base.Content;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;

/**
 * Created by bren on 06/06/15.
 *
 * Several utilities to serialise/deserialize utility with date format supports.
 *
 * Uses d MMMM yyy as default date format for date fields. (e.g. 1 January 2015, 10 February 2015)
 *
 */
public class ContentSerialiser {

    private static final String DEFAULT_DATE_PATTERN = "d MMMM yyyy";

    private GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();

    public ContentSerialiser() {
        this(DEFAULT_DATE_PATTERN);
    }


    public ContentSerialiser(String datePattern) {
        gsonBuilder.setDateFormat(datePattern);
    }


    /**
     * Returns json string for given object
     * @return
     */
    public String serialise(Object object) {
        return gson().toJson(object);
    }

    public <O extends Object> O deserialise(String json, Class<O> type) {
        return gson().fromJson(json, type);
    }

    /**
     * Resolves content type and deserializes automatically to that implementation. Use if you do not need to know actual class implementation
     *
     * @param stream json stream
     * @return
     */
    public Content deserialise(InputStream stream) {
        gsonBuilder.registerTypeAdapter(Content.class, new ContentTypeResolver());
        return gson().fromJson(new InputStreamReader(stream), Content.class);
    }

    /**
     * Resolves content type and deserializes automatically to that implementation. Use if you do not need to know actual class implementation
     *
     * @param json
     * @return
     */
    public Content deserialise(String json) {
        gsonBuilder.registerTypeAdapter(Content.class, new ContentTypeResolver());
        return gson().fromJson(json, Content.class);
    }

    public <O extends Content> O deserialise(InputStream stream, Class<O> type) {
        return gson().fromJson(new InputStreamReader(stream), type);
    }


    private Gson gson() {
        return gsonBuilder.create();
    }

}
