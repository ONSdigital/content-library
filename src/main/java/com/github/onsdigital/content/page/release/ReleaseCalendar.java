package com.github.onsdigital.content.page.release;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.util.ContentConstants;

/**
 * Created by bren on 04/06/15.
 */
public class ReleaseCalendar extends Page {

    public ReleaseCalendar() {
        this.title = ContentConstants.RELEASE_CALENDAR_TITLE;
        this.uri =  ContentConstants.RELEASE_CALENDAR_URI;
    }


    @Override
    public PageType getType() {
        return PageType.release_calendar;
    }
}
