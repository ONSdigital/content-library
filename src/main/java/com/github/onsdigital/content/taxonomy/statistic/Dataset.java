package com.github.onsdigital.content.taxonomy.statistic;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.taxonomy.home.ProductPage;
import com.github.onsdigital.content.taxonomy.statistic.base.Publication;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 */
public class Dataset extends Publication {

    //Metadata
    public String datasetID;

    public Dataset(String datasetID, String name, URI uri, String summary, ProductPage productPage) {
        super(name, uri, summary, ContentType.dataset, productPage);
        this.datasetID = datasetID;
    }
}
