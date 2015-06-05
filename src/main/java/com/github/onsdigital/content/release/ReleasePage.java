package com.github.onsdigital.content.release;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.Contact;

import java.net.URI;
import java.util.Date;

/**
 * Created by bren on 04/06/15.
 */
public class ReleasePage extends Content {

    //Metadata
    public Contact contact;
    public Date releaseDate;
    public Date nextReleaseDate;
    public boolean nationalStatistics;

    public ReleasePage(String name, URI uri, String summary, ContentType type, Content parent) {
        super(name, uri, type, parent);
        this.summary = summary;
    }
}
