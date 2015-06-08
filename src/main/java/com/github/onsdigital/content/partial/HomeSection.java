package com.github.onsdigital.content.partial;

import com.github.onsdigital.content.statistic.data.base.StatisticalData;
import com.github.onsdigital.content.taxonomy.TaxonomyLandingPage;
import com.github.onsdigital.content.partial.reference.ContentReference;

/**
 * Represents sections on homepage with references to a level 2 page and a timeseries page
 *
 * @author Bren
 */

public class HomeSection implements Comparable<HomeSection> {


    public int index; //Used for ordering of sections on homepage
    public ContentReference<TaxonomyLandingPage> level2;
    public ContentReference<StatisticalData> statisticalDataReference;

    public HomeSection(ContentReference<TaxonomyLandingPage> themeReference, ContentReference<StatisticalData> statisticalDataReference) {
        this(themeReference, statisticalDataReference, null);
    }


    public HomeSection(ContentReference<TaxonomyLandingPage> level2, ContentReference<StatisticalData> statisticalDataReference, Integer index) {
        this.level2 = level2;
        this.statisticalDataReference = statisticalDataReference;
        this.index = index;
    }

    @Override
    public int compareTo(HomeSection o) {
        return Integer.compare(this.index, o.index);
    }

}
