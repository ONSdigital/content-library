package com.github.onsdigital.content.taxonomy.statistic.data.base;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.taxonomy.statistic.base.Publication;
import com.github.onsdigital.content.taxonomy.home.base.TaxonomyHome;

import java.net.URI;

/**
 * Created by bren on 05/06/15.
 */
public abstract class StatisticalData extends Publication {
    public StatisticalData(String name, URI uri, String summary, ContentType type, TaxonomyHome parent) {
        super(name, uri, summary, type, parent);
    }
}
