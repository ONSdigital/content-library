package com.github.onsdigital.content.util;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageDescription;
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
 * Uses ISO Date Time format with time zone as default date format for date fields. (e.g. 1 January 2015, 10 February 2015)
 */
public class ContentUtil {

    /**
     * Returns json string for given object
     *
     * @return json string
     */
    public static String serialise(Object object) {
        return gson().toJson(object);
    }


    /**
     * Deserialises json string into given Object type
     *
     * @param json json to be deserialised
     * @param type
     * @return
     */
    public static <O extends Object> O deserialise(String json, Class<O> type) {
        return gson().fromJson(json, type);
    }


    /**
     * Deserialises json stream into given Object type
     *
     * @param stream json stream to be deserialised
     * @param type
     * @return
     */


    public static <O extends Object> O deserialise(InputStream stream, Class<O> type) {
        return gson().fromJson(new InputStreamReader(stream), type);
    }


    /**
     * Resolves page type and deserializes automatically to that implementation. Use if you do not need to know actual class implementation
     *
     * @param stream json stream
     * @return
     */
    public static Page deserialisePage(InputStream stream) {
        return createBuilder(ContentConstants.JSON_DATE_PATTERN).registerTypeAdapter(Page.class, new PageTypeResolver()).create().fromJson(new InputStreamReader(stream), Page.class);
    }


    /**
     * Resolves page type and deserializes automatically to that implementation. Use if you do not need to know actual class implementation
     *
     * @param json
     * @return
     */
    public static Page deserialisePage(String json) {
        return createBuilder(ContentConstants.JSON_DATE_PATTERN).registerTypeAdapter(Page.class, new PageTypeResolver()).create().fromJson(json, Page.class);
    }


    /**
     * Clones given object and returns a new copy
     *
     * @param o   object to be cloned
     * @param <O> copy of given object
     * @return
     */
    public static <O extends Cloneable> O clone(O o) {
        Cloneable cloneable = o;
        return ObjectUtils.clone(o);
    }


    /**
     * Loads descriptions of referenced pages into reference objects. This will not load whole page data, but only descriptions of referenced pages
     *
     * @param contentService
     * @param pageReferences
     */
    public static void  loadReferencedPageDescription(ContentService contentService, List<PageReference> pageReferences) {
        if (pageReferences == null) {
            return;
        }
        for (PageReference reference : pageReferences) {
            loadReferencedPageDescription(contentService, reference);
        }
    }


    /**
     * Loads descriptions of referenced page into reference object. This will not load whole page data, but only description of referenced page
     *
     * @param contentService
     * @param pageReference
     */
    public static void loadReferencedPageDescription(ContentService contentService, PageReference pageReference) {
        if (pageReference == null) {
            return;
        }
        try {
            Page page = ContentUtil.deserialisePage(getJson(contentService, pageReference));
            pageReference.setDescription(page.getDescription());
        } catch (ContentNotFoundException e) {
            //TODO: If reference not found it will not load. Is that ok ?
            e.printStackTrace();
        }
    }


    /**
     * Loads data of referenced pages into reference objects. This will load whole page data including description
     *
     * @param contentService
     * @param pageReferences
     */
    public static void loadReferencedPages(ContentService contentService, List<PageReference> pageReferences) throws ContentNotFoundException {
        if (pageReferences == null) {
            return;
        }
        for (PageReference reference : pageReferences) {
            loadReferencedPage(contentService, reference);
        }
    }

    /**
     * Loads data of referenced page into reference object. This will load whole page data including description
     *
     * @param contentService
     * @param pageReference
     */
    public static void loadReferencedPage(ContentService contentService, PageReference pageReference) {
        if (pageReference == null) {
            return;
        }
        try {
            pageReference.setData(ContentUtil.deserialisePage(getJson(contentService, pageReference)));

            //Clear uri as it is already in data, it will be replaced with data in json
            pageReference.setUri(null);
        } catch (ContentNotFoundException e) {
            //TODO: If reference not found it will not load. Is that ok ?
            e.printStackTrace();
        }
    }

    private static InputStream getJson(ContentService contentService, PageReference pageReference) throws ContentNotFoundException {
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
            builder.setDateFormat(ContentConstants.JSON_DATE_PATTERN);
        }
        return builder;
    }

}
