package com.github.onsdigital.content.page.taxonomy;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.taxonomy.base.TaxonomyPage;
import com.github.onsdigital.content.partial.metadata.BulletinMetadata;
import com.github.onsdigital.content.partial.metadata.Metadata;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class ProductPage extends TaxonomyPage {

    //Statistic headline, might either be a time series or data slice.

    //First timeseries ( or headline is show as headline now )
    //    public PageReference headline;

    //First stats bulletin is shown as headline
//    public BulletinMetadata statsBulletinHeadline;

    //Statistic items ( time series, data slices )
    public List<PageReference> items;

    public List<Metadata> datasets;

    public List<BulletinMetadata> statsBulletins = new ArrayList<>();

    public List<Metadata> relatedArticles;

    @Override
    public PageType getType() {
        return PageType.product_page;
    }


    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);

//        ContentUtil.loadReferences(contentService, headline);
        ContentUtil.loadReferences(contentService, items);
    }
}