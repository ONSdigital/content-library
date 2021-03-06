package com.github.onsdigital.content.util;

import com.github.onsdigital.content.DirectoryListing;
import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
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
     * Returns json string for given object using a custom date format
     *
     * @return json string
     */
    public static String serialise(Object object, String datePattern) {
        return gson(datePattern).toJson(object);
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
     * Deserialises json string into given Object type using given date pattern
     *
     * @param json json to be deserialised
     * @param type
     * @return
     */
    public static <O extends Object> O deserialise(String json, Class<O> type, String datePattern) {
        return gson(datePattern).fromJson(json, type);
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
     * Deserialises json stream into given Object type
     *
     * @param stream      json stream to be deserialised
     * @param type
     * @param datePattern
     * @return
     */


    public static <O extends Object> O deserialise(InputStream stream, Class<O> type, String datePattern) {
        return gson(datePattern).fromJson(new InputStreamReader(stream), type);
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
     * Resolves page type and deserializes automatically to that implementation. Use if you do not need to know actual class implementation,
     *
     * @param stream json stream
     * @param datePattern date pattern to be used when deserialising
     * @return
     */
    public static Page deserialisePage(InputStream stream, String datePattern) {
        return createBuilder(datePattern).registerTypeAdapter(Page.class, new PageTypeResolver()).create().fromJson(new InputStreamReader(stream), Page.class);
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
     * Resolves page type and deserializes automatically to that implementation. Use if you do not need to know actual class implementation
     *
     * @param json
     * @param datePattern
     * @return
     */
    public static Page deserialisePage(String json, String datePattern) {
        return createBuilder(datePattern).registerTypeAdapter(Page.class, new PageTypeResolver()).create().fromJson(json, Page.class);
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
    public static <T extends PageReference> void loadReferencedPageDescription(ContentService contentService, List<T> pageReferences) {
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
    public static <T extends PageReference> void loadReferencedPageDescription(ContentService contentService, T pageReference) {
        if (pageReference == null) {
            return;
        }
        try {
            Page page = ContentUtil.deserialisePage(getJson(contentService, pageReference));
            pageReference.setDescription(page.getDescription());
        } catch (Exception e) {
            // If reference can not be resolved in any way it will not load.
            System.err.println("loadReferencedPageDescription(): !!!!!!!!!Warning: Related page description load failed: " + pageReference.getUri() + "!!!!!!!!!!");
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
        } catch (Exception e) {
            // If reference can not be resolved in any way it will not load.
            System.err.println("loadReferencedPage():  !!!!!!!!!Warning: Related page data load failed: " + pageReference.getUri() + "!!!!!!!!!!");
            e.printStackTrace();
        }
    }

    /**
     * Populate a list of files / folders for a given path.
     *
     * @param path
     * @return
     * @throws IOException
     */
    public static DirectoryListing listDirectory(Path path) throws IOException {
        DirectoryListing listing = new DirectoryListing();
        try (DirectoryStream<Path> stream = Files
                .newDirectoryStream(path)) {
            for (Path directory : stream) {
                if (Files.isDirectory(directory)) {
                    listing.folders.put(directory.getFileName().toString(),
                            directory.toString());
                } else {
                    listing.files.put(directory.getFileName().toString(),
                            directory.toString());
                }
            }
        }
        return listing;
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
            builder.registerTypeAdapter(Date.class, new IsoDateSerializer(datePattern));
        } else {
            builder.registerTypeAdapter(Date.class, new IsoDateSerializer(ContentConstants.JSON_DATE_PATTERN));
        }
        return builder;
    }
}
