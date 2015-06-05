package com.github.onsdigital.content.adhoc;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;

import java.net.URI;
import java.util.Date;

/**
 * Created by bren on 04/06/15.
 */
public class AdHoc extends Content {

    public Date releaseDate;
    public int reference;

    public AdHoc(String name, URI uri, Content parent) {
        super(name, uri, ContentType.adhoc, parent);
    }

    private AdHoc() {

    }
}
