package com.github.onsdigital.content.partial;

import com.github.onsdigital.content.taxonomy.home.TaxonomyLandingPage;
import com.github.onsdigital.content.taxonomy.statistic.data.TimeSeries;
import com.github.onsdigital.content.partial.reference.ContentReference;

/**
 * Represents sections on homepage with references to a level 2 page and a timeseries page
 *
 * @author Bren
 */

public class HomeSection implements Comparable<HomeSection> {


    public int index; //Used for ordering of sections on homepage
    public ContentReference<TaxonomyLandingPage> level2;
    public ContentReference<TimeSeries> timeSeries;

    public HomeSection(ContentReference<TaxonomyLandingPage> level2, ContentReference<TimeSeries> timeSeries, int index) {
        this.level2 = level2;
        this.timeSeries = timeSeries;
        this.index = index;
    }

    @Override
    public int compareTo(HomeSection o) {
        return Integer.compare(this.index, o.index);
    }

}
