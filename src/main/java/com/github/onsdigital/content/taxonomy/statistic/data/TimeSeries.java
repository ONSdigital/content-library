package com.github.onsdigital.content.taxonomy.statistic.data;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.link.ContentLink;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.taxonomy.home.ProductPage;
import com.github.onsdigital.content.taxonomy.statistic.data.base.StatisticalData;

import java.net.URI;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class TimeSeries extends StatisticalData {

    /*Metadata*/
    public String seasonalAdjustment;

    //Below fields appear on references to time series on other content types
    public String date;
    public String number;


    /*Body*/
    public List<ContentLink<TimeSeries>> relatedTimeseries;

    public TimeSeries(String cdid, String name, URI uri, String summary, ProductPage parent) {
        super(cdid,name, uri, summary, ContentType.timeseries, parent);
    }

    private TimeSeries() {

    }
}
