package com.github.onsdigital.content.release;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.util.ContentConstants;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 */
public class ReleaseCalendar extends Content {

    public ReleaseCalendar() {
        this.title = ContentConstants.RELEASE_CALENDAR_TITLE;
        this.uri =  ContentConstants.RELEASE_CALENDAR_URI;
    }


    @Override
    public ContentType getType() {
        return ContentType.release_calendar;
    }
}
