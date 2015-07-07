package com.github.onsdigital.content.page.taxonomy;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.taxonomy.base.TaxonomyPage;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class ProductPage extends TaxonomyPage {

    private List<PageReference> items;
    private List<PageReference> datasets;
    private List<PageReference> statsBulletins;
    private List<PageReference> relatedArticles;


    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        ContentUtil.loadReferencedPages(contentService, items);
        ContentUtil.loadReferencedPageDescription(contentService, datasets);
        ContentUtil.loadReferencedPageDescription(contentService, statsBulletins);
        ContentUtil.loadReferencedPageDescription(contentService, relatedArticles);
    }

    @Override
    public PageType getType() {
        return PageType.product_page;
    }

    public List<PageReference> getItems() {
        return items;
    }

    public void setItems(List<PageReference> items) {
        this.items = items;
    }


    public List<PageReference> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<PageReference> datasets) {
        this.datasets = datasets;
    }

    public List<PageReference> getStatsBulletins() {
        return statsBulletins;
    }

    public void setStatsBulletins(List<PageReference> statsBulletins) {
        this.statsBulletins = statsBulletins;
    }


    public List<PageReference> getRelatedArticles() {
        return relatedArticles;
    }

    public void setRelatedArticles(List<PageReference> relatedArticles) {
        this.relatedArticles = relatedArticles;
    }
}
