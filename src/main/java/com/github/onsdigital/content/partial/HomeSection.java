package com.github.onsdigital.content.partial;

import com.github.onsdigital.content.taxonomy.home.TaxonomyLandingPage;
import com.github.onsdigital.content.taxonomy.statistic.data.TimeSeries;
import com.github.onsdigital.content.partial.link.Reference;

/**
 * Represents sections on homepage with references to a level 2 page and a timeseries page
 *
 * @author Bren
 */

public class HomeSection implements Comparable<HomeSection> {


    public int index; //Used for ordering of sections on homepage
    public Reference<TaxonomyLandingPage> level2;
    public Reference<TimeSeries> timeSeries;

    public HomeSection(Reference<TaxonomyLandingPage> level2, Reference<TimeSeries> timeSeries, int index) {
        this.level2 = level2;
        this.timeSeries = timeSeries;
        this.index = index;
    }

    @Override
    public int compareTo(HomeSection o) {
        return Integer.compare(this.index, o.index);
    }

}
