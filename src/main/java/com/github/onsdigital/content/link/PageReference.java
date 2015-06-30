package com.github.onsdigital.content.link;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageDescription;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Reference to pages. Contains the uri to referenced page and also provides a mechanism to lazy load the description or full data of  referred page
 */
public class PageReference extends Content implements Comparable<PageReference> {

    /**
     * URI should be immutable. If uri of a page changes the old uri should be redirected to new one. This should not be changed
     */
    private URI uri;
    //Index used for ordering
    private Integer index;
    //Description or full page may be lazy loaded
    private PageDescription description;
    private Page data;


    /**
     * Creates the reference and initializes all necessary fields with given page
     *
     * @param page
     */
    public PageReference(Page page) {
        this(page, null);
    }

    /**
     * Creates the reference to given page using only uri of the page
     *
     * @param page
     * @param index Index used for odering of links when set
     */
    public PageReference(Page page, Integer index) {
        this.index = index;
        setUri(page.getUri());
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

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public PageDescription getDescription() {
        return description;
    }

    public void setDescription(PageDescription description) {
        this.description = description;
    }

    public Page getData() {
        return data;
    }

    public void setData(Page data) {
        this.data = data;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
