package com.github.onsdigital.content.partial.link;

import com.github.onsdigital.content.base.Content;

/**
 * Created by bren on 04/06/15.
 *
 * Reference to any content type. It includes the link to referred taxonomy node and summary for the node.
 *
 */
public class Reference<T extends Content> {

    public ContentLink link;
    public String summary;

    public Reference(T content) {
        this.link = new ContentLink(content);
        this.summary = content.summary;
    }
}
