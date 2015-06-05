package com.github.onsdigital.content.taxonomy.statistic.data;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.taxonomy.home.ProductPage;
import com.github.onsdigital.content.taxonomy.statistic.data.base.StatisticalData;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 */
public class TimeSeries extends StatisticalData {

    //Metadata
    public String cdid;

    public TimeSeries(String cdid, String name, URI uri, String summary, ProductPage parent) {
        super(name, uri, summary, ContentType.timeseries, parent);
        this.cdid = cdid;
    }
}
