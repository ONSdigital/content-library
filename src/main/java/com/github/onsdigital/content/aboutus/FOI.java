package com.github.onsdigital.content.aboutus;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;

import java.net.URI;
import java.util.Date;

/**
 * Created by bren on 04/06/15.
 */
public class FOI extends Content {

    public Date releaseDate;

    public FOI(String name, URI uri, AboutUsBrowsePage parent) {
        super(name, uri, ContentType.foi, parent);
    }
}
