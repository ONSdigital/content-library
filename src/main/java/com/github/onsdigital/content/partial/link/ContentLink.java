package com.github.onsdigital.content.partial.link;

import com.github.onsdigital.content.base.Content;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Link to contents. Contains the uri and title of linked content
 */
public class ContentLink<T extends Content> {

    public String name;
    public URI uri;

    //Create breadcrumb item  that links to given content
    public ContentLink(T content) {
        this.name = content.title;
        this.uri = content.uri;
    }

    //For use of serialise utils
    private ContentLink() {

    }
}
