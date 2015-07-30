package com.github.onsdigital.content.util;

import org.apache.commons.lang3.StringUtils;

import java.lang.RuntimeException;import java.lang.String;import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bren on 28/05/15.
 * <p>
 * Several utilities for formatting, cleaning  and resolving given uri
 * <p>
 * Uris are deemed valid if without parameters, starting with slash("/") and without multiple slashes
 */
public class URIUtil {

    private final static Pattern uriPattern = Pattern.compile("/(([^/]+)/?)*");

    /**
     * Removes endpoint from given uri ( the first uri segment )
     * <p>
     * e.g. uri for /data/economy/inflationandpriceindices is /economy/inflationandpriceindices
     *
     * @return The URI path, lowercased, without the endpoint title or trailing
     * slash.
     * @throws com.github.onsdigital.content.util.URIUtil.InvalidUriException
     */
    public static String removeEndpoint(String uriString) {
        uriString = cleanUri(uriString);
        validate(uriString);

        int indexOfSecondSlash = StringUtils.indexOf(uriString, "/", 1);
        if (indexOfSecondSlash == -1) {
            return "/";
        } else {
            return StringUtils.substring(uriString, indexOfSecondSlash);  //Remove endpoint title
        }
    }


    /**
     * Extracts request type from request type suffixed uris (the last uri segment)
     * <p>
     * e.g.
     * for uri "/economy/inflationandpriceindices/data" request type is "data"
     *
     * @return request type
     * @throws com.github.onsdigital.content.util.URIUtil.InvalidUriException
     */
    public static String resolveRequestType(String uriString) {
        uriString = cleanUri(uriString);
        validate(uriString);
        if ("/".equals(uriString)) {
            return uriString;
        }

        int lastSlashIndex = StringUtils.lastIndexOf(uriString, "/");
        return StringUtils.substring(uriString, lastSlashIndex + 1);
    }

    /**
     * Extracts resource uri from request type suffixed uris.
     * <p>
     * e.g.
     * for uri "/economy/inflationandpriceindices/data" resource uri "/economy/inflationandpriceindices"
     *
     * @return uri
     */
    public static String resolveResouceUri(String uriString) {
        uriString = cleanUri(uriString);
        validate(uriString);

        int lastSlashIndex = StringUtils.lastIndexOf(uriString, "/");
        return StringUtils.substring(uriString, 0, lastSlashIndex);

    }


    public static void validate(String uriString) {
        uriString = StringUtils.defaultIfBlank(uriString, "/");
        Matcher matcher = uriPattern.matcher(uriString);

        if (!matcher.matches()) {
            throw new InvalidUriException(uriString);
        }
    }

    //Remove trailing slash if any and make lowercase
    public static String cleanUri(String uriString) {
        uriString = StringUtils.trim(StringUtils.defaultIfBlank(uriString, "/"));
        if ("/".equals(uriString)) {
            return uriString;
        }
        uriString = StringUtils.removeEnd(uriString, "/");
        return StringUtils.lowerCase(uriString);
    }

    public static class InvalidUriException extends RuntimeException {
        public InvalidUriException(String uriString) {
            super("Invalid uri: " + uriString);
        }
    }
}
