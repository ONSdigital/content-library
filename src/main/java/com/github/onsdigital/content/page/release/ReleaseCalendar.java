package com.github.onsdigital.content.page.release;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageDescription;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.util.ContentConstants;

/**
 * Created by bren on 04/06/15.
 */
public class ReleaseCalendar extends Page {

    public ReleaseCalendar() {
        setUri(ContentConstants.RELEASE_CALENDAR_URI);
        PageDescription description = new PageDescription();
        description.setTitle(ContentConstants.RELEASE_CALENDAR_TITLE);
    }

    @Override
    public PageType getType() {
        return PageType.release_calendar;
    }
}
