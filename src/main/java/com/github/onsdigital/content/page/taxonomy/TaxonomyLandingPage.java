package com.github.onsdigital.content.page.taxonomy;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.taxonomy.base.TaxonomyPage;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Represents taxonomy landing page
 */
public class TaxonomyLandingPage extends TaxonomyPage {

    //Sections is not particularly a good name. Used for compatibility with Alpha website
    private List<PageReference> sections = new ArrayList<>();

    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        ContentUtil.loadReferencedPageDescription(contentService, sections);
    }

    @Override
    public PageType getType() {
        return PageType.taxonomy_landing_page;
    }

    public List<PageReference> getSections() {
        return sections;
    }

    public void setSections(List<PageReference> sections) {
        this.sections = sections;
    }
}
