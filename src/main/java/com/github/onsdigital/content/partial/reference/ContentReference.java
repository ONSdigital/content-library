package com.github.onsdigital.content.partial.reference;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.partial.link.ContentLink;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Reference to any content type. It includes the uri of referred content and summary of if it is available.
 *
 * This class should never be used internally
 * <p>
 */
public class ContentReference<T extends Content> extends  ContentLink {

    public String summary;
    public String name;

    public ContentReference() {

    }

    public ContentReference(T content) {
        super(content);
        this.summary = content.summary;
        this.uri = content.uri;
    }
}
