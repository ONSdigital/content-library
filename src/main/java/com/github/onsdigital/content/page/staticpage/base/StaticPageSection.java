package com.github.onsdigital.content.page.staticpage.base;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.Page;

/**
 * Created by bren on 30/06/15.
 *
 * References to static pages, holds a short version of summary of referred page seperately.
 */
public class StaticPageSection extends PageReference {

    private String summary;

    public StaticPageSection(Page page) {
        super(page);
    }

    public StaticPageSection(Page page, Integer index) {
        super(page, index);
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
