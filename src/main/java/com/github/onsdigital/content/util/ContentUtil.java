package com.github.onsdigital.content.util;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.partial.metadata.Metadata;
import com.github.onsdigital.content.service.ContentService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.List;

/**
 * Created by bren on 06/06/15.
 *
 * Several utilities to serialise/deserialize utility with date format supports.
 *
 * Uses d MMMM yyy as default date format for date fields. (e.g. 1 January 2015, 10 February 2015)
 *
 */
public class ContentUtil {

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
    public static Page deserialisePage(InputStream stream) {
        return gson().fromJson(new InputStreamReader(stream), Page.class);
    }

    /**
     * Resolves page type and deserializes automatically to that implementation. Use if you do not need to know actual class implementation
     *
     * @param json
     * @return
     */
    public static Page deserialisePage(String json) {
        return gson().fromJson(json, Page.class);
    }

    public static <O extends Object> O deserialise(InputStream stream, Class<O> type) {
        return gson().fromJson(new InputStreamReader(stream), type);
    }


    public static <O extends  Cloneable> O clone(O o) {
        Cloneable cloneable = o;
        return ObjectUtils.clone(o);
    }

    public static void initializeMetadata(ContentService contentService, List<PageReference> pageReferences) {
        for (PageReference pageReference : pageReferences) {
            initializeMetadata(contentService,pageReference);
        }
    }
    public static void initializeFullData(ContentService contentService, List<PageReference> pageReferences) {
        for (PageReference pageReference : pageReferences) {
            initializeFullData(contentService, pageReference);
        }
    }
    public static void initializeMetadata(ContentService contentService, PageReference pageReference) {
        pageReference.metadata = ContentUtil.deserialise(getJson(contentService, pageReference), Metadata.class);
    }

    public static void initializeFullData(ContentService contentService, PageReference pageReference) {
        pageReference.fullData = ContentUtil.deserialise(getJson(contentService, pageReference), Page.class);
    }

    private static InputStream getJson(ContentService contentService, PageReference pageReference) {
        return contentService.getDataAsString(pageReference.toString());
    }



    private static Gson gson(String datePattern) {
        GsonBuilder builder = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(Page.class, new PageTypeResolver());
        if (StringUtils.isNotBlank(datePattern)) {
            builder.setDateFormat(datePattern);
        } else {
            builder.setDateFormat(ContentConstants.DEFAULT_DATE_PATTERN);
        }
        return builder.create();
    }

    private static Gson gson() {
        return gson(null);
    }

}
