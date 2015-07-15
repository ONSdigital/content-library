package com.github.onsdigital.content.page.compendium;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.statistics.dataset.Dataset;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

/**
 * Created by bren on 06/07/15.
 */
public class CompendiumData extends Dataset {

    private PageReference parent;


    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        ContentUtil.loadReferencedPageDescription(contentService,parent);
    }

    @Override
    public PageType getType() {
        return PageType.compendium_data;
    }

    public PageReference getParent() {
        return parent;
    }

    public void setParent(PageReference parent) {
        this.parent = parent;
    }
}
