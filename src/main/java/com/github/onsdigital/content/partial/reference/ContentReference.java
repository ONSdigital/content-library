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
public class ContentReference<T extends Content> extends  ContentLink implements  Comparable<ContentReference> {

    public String summary;
    //Index used for ordering
    public Integer index;

    public ContentReference(T content) {
        this(content, null);
    }

    public ContentReference(T content, Integer index) {
        super(content);
        this.summary = content.summary;
    }

    @Override
    public int compareTo(ContentReference o) {
        return Integer.compare(this.index, o.index);
    }

}
