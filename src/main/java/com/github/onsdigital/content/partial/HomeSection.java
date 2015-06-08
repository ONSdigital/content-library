package com.github.onsdigital.content.partial;

import com.github.onsdigital.content.partial.link.ContentLink;
import com.github.onsdigital.content.statistic.data.base.StatisticalData;
import com.github.onsdigital.content.taxonomy.TaxonomyLandingPage;

/**
 * Represents sections on homepage with references to a level 2 page and a timeseries page
 *
 * @author Bren
 */

public class HomeSection implements Comparable<HomeSection> {


    public Integer index; //Used for ordering of sections on homepage
    public ContentLink<TaxonomyLandingPage> theme;
    public ContentLink<StatisticalData> statistics;

    public HomeSection(ContentLink<TaxonomyLandingPage> themeReference, ContentLink<StatisticalData> statistics) {
        this(themeReference, statistics, null);
    }


    public HomeSection(ContentLink<TaxonomyLandingPage> themeLink, ContentLink<StatisticalData> statistics, Integer index) {
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
