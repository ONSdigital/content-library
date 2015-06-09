package com.github.onsdigital.content.partial.link;

import com.github.onsdigital.content.base.Content;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Link to contents. Contains the uri and title of linked content
 */
public class ContentLink<T extends Content> implements Comparable<ContentLink> {

    public URI uri;
    //Index used for ordering
    public Integer index;

    public ContentLink() {

    }

    /**
     * Creates the link and initializes all necessary fields with given content
     *
     * @param content
     */
    public ContentLink(T content) {
        this(content, null);
    }

    /**
     *
     * Creates the link and initializes all necessary fields with given content
     *
     * @param content
     * @param index Index used for odering of links when set
     */
    public ContentLink(T content , Integer index) {
        this.index = index;
        this.uri = content.uri;
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
