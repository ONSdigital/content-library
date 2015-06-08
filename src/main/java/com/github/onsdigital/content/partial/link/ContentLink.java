package com.github.onsdigital.content.partial.link;

import com.github.onsdigital.content.base.Content;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Link to contents. Contains the uri and title of linked content
 */
public class ContentLink<T extends Content> implements  Comparable<ContentLink> {

    public String name;
    public URI uri;

    //Index used for ordering
    public Integer index;

    public ContentLink(T content) {
        this(content, null);
    }


    public ContentLink(T content, Integer index) {
        this.index = index;
        this.name = content.name;
        this.uri = content.uri;
    }

    //For use of serialise utils
    private ContentLink() {

    }

    @Override
    public int compareTo(ContentLink o) {
        //nulls last or first
        if (this.index == null) {
            return -1;
        }
        return Integer.compare(this.index, o.index);
    }
}
