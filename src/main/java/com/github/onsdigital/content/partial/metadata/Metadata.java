package com.github.onsdigital.content.partial.metadata;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.page.base.Page;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Minimal metadata for any page
 * <p>
 */
public class Metadata extends Content implements Comparable<Metadata>  {

    public String title;
    public String summary;
    public URI uri;
    public Integer index;

    public Metadata() {
    }

    public Metadata(Page page) {
        this.uri = page.uri;
        this.summary = page.summary;
        this.title = page.title;
    }

    public Metadata(Page page, Integer index) {
        this(page);
        this.index = index;
    }


    @Override
    public int compareTo(Metadata o) {
        //nulls last or first
        if (this.index == null) {
            return -1;
        }
        return Integer.compare(this.index, o.index);
    }

}
