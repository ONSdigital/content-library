package com.github.onsdigital.content.util;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.net.URI;

/**
 * Created by bren on 10/06/15.
 */
public class ContentConstants {

    public static final String JSON_DATE_PATTERN = DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern();
    public  static final URI HOME_URI = URI.create("/");
    public  static final String HOME_TITLE = "Home";

    public static final String RELEASE_CALENDAR_TITLE = "Release Calendar";
    public static final URI RELEASE_CALENDAR_URI = URI.create("/releasecalendar");

}