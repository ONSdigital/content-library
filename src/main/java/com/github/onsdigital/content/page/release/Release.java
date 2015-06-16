package com.github.onsdigital.content.page.release;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Release extends Page {

    private List<PageReference> articles = new ArrayList<>();
    private List<PageReference> bulletins = new ArrayList<>();
    private List<PageReference> datasets = new ArrayList<>();

    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        ContentUtil.loadReferencedPageDescription(contentService, articles);
        ContentUtil.loadReferencedPageDescription(contentService, bulletins);
        ContentUtil.loadReferencedPageDescription(contentService, datasets);
    }

    @Override
    public PageType getType() {
        return PageType.release;
    }


    public List<PageReference> getArticles() {
        return articles;
    }

    public void setArticles(List<PageReference> articles) {
        this.articles = articles;
    }

    public List<PageReference> getBulletins() {
        return bulletins;
    }

    public void setBulletins(List<PageReference> bulletins) {
        this.bulletins = bulletins;
    }

    public List<PageReference> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<PageReference> datasets) {
        this.datasets = datasets;
    }

}
