package com.github.onsdigital.content.base;

import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

/**
 * Created by bren on 10/06/15.
 * <p>
 * This is the generic content object that that has common characteristic of all content types on the website
 */
public abstract class Content implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return ContentUtil.clone(this);
    }

    /**
     * Serialises object into json document as String.
     *
     * @return json
     */
    public String toJson() {
        return ContentUtil.serialise(this);
    }


    /**
     * Initializes necessary info for referenced pages. Override this method to implement necessary metadata or data load for a page reference
     *
     * @param contentService
     */
    public void loadReferences(ContentService contentService) {

    }
}
