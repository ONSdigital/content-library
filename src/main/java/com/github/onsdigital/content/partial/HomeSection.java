package com.github.onsdigital.content.partial;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.partial.metadata.Metadata;
import com.github.onsdigital.content.page.statistics.data.base.StatisticalData;
import com.github.onsdigital.content.page.taxonomy.TaxonomyLandingPage;

/**
 * Represents sections on homepage with references to a landing page and a timeseries page
 *
 * @author Bren
 */

public class HomeSection extends Content implements Comparable<HomeSection> {


    public Integer index; //Used for ordering of sections on homepage
    public PageReference theme;
    public PageReference statistics;

    public HomeSection(PageReference themeReference, PageReference statistics) {
        this(themeReference, statistics, null);
    }


    public HomeSection(PageReference themeLink, PageReference statistics, Integer index) {
        this.theme = themeLink;
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

}
