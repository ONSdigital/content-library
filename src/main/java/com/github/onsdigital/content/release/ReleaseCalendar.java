package com.github.onsdigital.content.release;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.home.HomePage;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 */
public class ReleaseCalendar extends Content {

    private transient static final String RELEASE_CALENDAR = "Release Calendar";
    private transient static final URI RELEASE_CALENDAR_URI = URI.create("/releasecalendar");

    public ReleaseCalendar() {
        super(ContentType.release_calendar);
        this.title = RELEASE_CALENDAR;
        this.uri =  RELEASE_CALENDAR_URI;
    }

}
