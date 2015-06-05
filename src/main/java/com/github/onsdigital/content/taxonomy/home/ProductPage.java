package com.github.onsdigital.content.taxonomy.home;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.taxonomy.home.base.TaxonomyHome;
import com.github.onsdigital.content.taxonomy.statistic.Article;
import com.github.onsdigital.content.taxonomy.statistic.Bulletin;
import com.github.onsdigital.content.taxonomy.statistic.Dataset;
import com.github.onsdigital.content.taxonomy.statistic.data.base.StatisticalData;
import com.github.onsdigital.content.partial.link.Reference;

import java.net.URI;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class ProductPage extends TaxonomyHome {

    //Statistic headline, might either be a time series or data slice.
    public Reference<StatisticalData> headline;

    public Reference<Bulletin> statsBulletinHeadline;

    //Statistic items ( time series, data slices )
    public List<Reference<StatisticalData>> items;

    public List<Reference<Dataset>> datasets;

    public List<Reference<Bulletin>> statsBulletins;

    public List<Reference<Article>> relatedArticles;


    public ProductPage(String name, URI uri, String summary, TaxonomyLandingPage parent) {
        super(name, uri, ContentType.product_page, parent);
        this.summary = summary;
    }
}
