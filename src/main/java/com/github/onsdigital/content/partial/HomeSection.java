package com.github.onsdigital.content.partial;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.partial.metadata.Metadata;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

/**
 * Represents sections on homepage with references to a landing page and a timeseries page
 *
 * @author Bren
 */

public class HomeSection extends Content implements Comparable<HomeSection> {


    public Integer index; //Used for ordering of sections on homepage
    public Metadata theme;
    public PageReference statistics;

    public HomeSection(Metadata themeReference, PageReference statistics) {
        this(themeReference, statistics, null);
    }


    public HomeSection(Metadata theme, PageReference statistics, Integer index) {
        this.theme = theme;
        this.statistics = statistics;
        this.index = index;
    }

    @Override
    public int compareTo(HomeSection o) {
        if (this.index == null) {
            return -1;
        }
        return Integer.compare(this.index, o.index);
    }

    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        ContentUtil.loadReferences(contentService, statistics);
    }
}
