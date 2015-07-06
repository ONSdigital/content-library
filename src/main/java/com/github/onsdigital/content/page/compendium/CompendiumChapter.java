package com.github.onsdigital.content.page.compendium;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.statistics.base.Statistics;
import com.github.onsdigital.content.page.statistics.document.article.ArticleDescription;
import com.github.onsdigital.content.page.statistics.document.base.StatisticalDocument;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class CompendiumChapter extends StatisticalDocument<CompendiumDescription> {

    private List<PageReference> relatedDocuments;
    private PageReference parent;

    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        ContentUtil.loadReferencedPageDescription(contentService, parent);
        ContentUtil.loadReferencedPageDescription(contentService, relatedDocuments);
    }

    @Override
    public PageType getType() {
        return PageType.compendium_chapter;
    }

    @Override
    public List<PageReference> getRelatedData() {
        return super.getRelatedData();
    }

    @Override
    public void setRelatedData(List<PageReference> relatedData) {
        super.setRelatedData(relatedData);
    }

    public PageReference getParent() {
        return parent;
    }

    public void setParent(PageReference parent) {
        this.parent = parent;
    }

}
