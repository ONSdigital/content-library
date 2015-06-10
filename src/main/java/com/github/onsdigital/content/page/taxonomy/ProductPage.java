package com.github.onsdigital.content.page.taxonomy;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.statistics.Dataset;
import com.github.onsdigital.content.page.statistics.data.base.StatisticalData;
import com.github.onsdigital.content.page.statistics.document.Article;
import com.github.onsdigital.content.page.statistics.document.Bulletin;
import com.github.onsdigital.content.page.taxonomy.base.TaxonomyPage;
import com.github.onsdigital.content.partial.metadata.BulletinMetadata;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class ProductPage extends TaxonomyPage {

    //Statistic headline, might either be a time series or data slice.
    public PageReference headline;

    public PageReference statsBulletinHeadline;

    //Statistic items ( time series, data slices )
    public List<PageReference> items;

    public List<PageReference> datasets;

    public List<PageReference> statsBulletins = new ArrayList<>();

    public List<PageReference> relatedArticles;

    @Override
    public PageType getType() {
        return PageType.product_page;
    }


    @Override
    public void loadReferences(ContentService contentService) {
        super.loadReferences(contentService);
        ContentUtil.initializeMetadata(contentService, statsBulletinHeadline);
        ContentUtil.initializeFullData(contentService, headline);
        ContentUtil.initializeFullData(contentService, items);
        ContentUtil.initializeMetadata(contentService, datasets);
        ContentUtil.initializeMetadata(contentService, statsBulletins);
        ContentUtil.initializeMetadata(contentService, relatedArticles);
    }
}
