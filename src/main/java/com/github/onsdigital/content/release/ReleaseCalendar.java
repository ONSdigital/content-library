package com.github.onsdigital.content.release;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 */
public class ReleaseCalendar extends Content {

    public ReleaseCalendar(String name, URI uri, ContentType type, Content parentContent) {
        super(name, uri, type, parentContent);
    }

    private ReleaseCalendar() {

    }
}
