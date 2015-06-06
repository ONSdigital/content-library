package com.github.onsdigital.content.taxonomy.statistic.data;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.link.ContentLink;
import com.github.onsdigital.content.taxonomy.home.ProductPage;
import com.github.onsdigital.content.taxonomy.statistic.Dataset;
import com.github.onsdigital.content.taxonomy.statistic.data.base.StatisticalData;

import java.net.URI;
import java.util.List;

/**
 * Created by bren on 05/06/15.
 */
public class DataSlice extends StatisticalData {

    /*Metadata*/


    /*Body*/
    public List<ContentLink<Dataset>> relatedDatasets;


    public DataSlice(String cdid, String name, URI uri, String summary, ContentType type, ProductPage parent) {
        super(cdid, name, uri, summary, type, parent);
    }

    private DataSlice() {

    }
}
