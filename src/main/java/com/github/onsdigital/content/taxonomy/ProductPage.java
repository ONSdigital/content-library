package com.github.onsdigital.content.taxonomy;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.reference.BulletinReference;
import com.github.onsdigital.content.partial.reference.ContentReference;
import com.github.onsdigital.content.statistic.Dataset;
import com.github.onsdigital.content.statistic.data.base.StatisticalData;
import com.github.onsdigital.content.statistic.document.Article;
import com.github.onsdigital.content.statistic.document.Bulletin;
import com.github.onsdigital.content.taxonomy.base.TaxonomyNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class ProductPage extends TaxonomyNode {

    //Statistic headline, might either be a time series or data slice.
    public ContentReference<StatisticalData> headline;

    public ContentReference<Bulletin> statsBulletinHeadline;

    //Statistic items ( time series, data slices )
    public List<ContentReference<StatisticalData>> items;

    public List<ContentReference<Dataset>> datasets;

    public List<BulletinReference> statsBulletins = new ArrayList<>();

    public List<ContentReference<Article>> relatedArticles;

    @Override
    public ContentType getType() {
        return ContentType.product_page;
    }
}
