package com.github.onsdigital.content.serialiser;

import com.github.onsdigital.content.base.Content;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by bren on 06/06/15.
 *
 * Several utilities to serialise/deserialize content types.
 *
 * Uses d MMM yyy as default date format for date fields. (e.g. 1 Jan 2015, 10 Feb 2015)
 *
 */
public class ContentSerialiser {

    private static final String DEFAULT_DATE_PATTERN = "d MMM yyyy";

    private Gson gson;

    public ContentSerialiser() {
        gson = createBuilder().create();
    }

    public ContentSerialiser(String datePattern) {
        gson = createBuilder(datePattern).create();
    }


    /**
     * Returns json string for given content. Returned json is compact
     * @param content
     * @return
     */
    public String serialise(Content content) {
        return gson.toJson(content);
    }

    public <O extends Content> O deserialise(String json, Class<O> type) {
        return gson.fromJson(json, type);
    }

    public <O extends Content> O deserialise(InputStream stream, Class<O> type) {
        return gson.fromJson(new InputStreamReader(stream), type);
    }

    private GsonBuilder createBuilder() {
        return createBuilder( DEFAULT_DATE_PATTERN);
    }

    private GsonBuilder createBuilder(String datePattern) {
        return new GsonBuilder().setDateFormat(datePattern).setPrettyPrinting();
    }


}
