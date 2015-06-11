package com.github.onsdigital.content.link;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.partial.metadata.Metadata;

import java.net.URI;
import java.util.HashMap;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Reference to page contents. Contains the uri to referenced page and also provides a mechanism to lazy load a metadata or full data of  referred page
 */
public class PageReference extends Content implements Comparable<PageReference> {

    /**
     * URI should be immutable. If uri of a page changes the old uri should be redirected to new one. This should not be changed
     */
    private URI uri;
    //Index used for ordering
    public Integer index;

    public Page data;

    public PageReference() {

    }

    /**
     * Creates the link and initializes all necessary fields with given content
     *
     * @param page
     */
    public PageReference(Page page) {
        this(page, null);
    }

    /**
     * Creates the link and initializes all necessary fields with given content
     *
     * @param page
     * @param index Index used for odering of links when set
     */
    public PageReference(Page page, Integer index) {
        this.index = index;
        this.uri = page.uri;
    }

    @Override
    public int compareTo(PageReference o) {
        //nulls last or first
        if (this.index == null) {
            return -1;
        }
        return Integer.compare(this.index, o.index);
    }

    public URI getUri() {
        return uri;
    }
}
