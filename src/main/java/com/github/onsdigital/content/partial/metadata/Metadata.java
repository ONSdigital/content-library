package com.github.onsdigital.content.partial.metadata;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.page.base.Page;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Minimal metadata for any page
 * <p>
 */
public class Metadata extends Content  {

    public String summary;
    public String title;

    public Metadata() {

    }

    public Metadata(Page page) {
        this.title = page.title;
        this.summary = page.summary;
    }

}
