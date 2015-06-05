package com.github.onsdigital.content.partial.reference;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.partial.link.ContentLink;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Reference to any content type. It includes the link to referred content and basic summary.
 * <p>
 * This class represents references to other content type on any content page that displays summary information along with title of referred content.
 * But not the actual data of referred content
 */
public class ContentReference<T extends Content> {

    public ContentLink link;
    public String summary;

    public ContentReference(T content) {
        this.link = new ContentLink(content);
        this.summary = content.summary;
    }
}
