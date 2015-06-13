package com.github.onsdigital.content.page.home;

import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.taxonomy.base.TaxonomyPage;
import com.github.onsdigital.content.partial.HomeSection;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentConstants;

import java.util.List;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Object mapping for homepage of the website
 * <p>
 * HomePage is considered as the root of Taxonomy. It also contains links and references to non-statistics contents (Methodology, Release, About Us pages , etc.)
 */
public class HomePage extends TaxonomyPage {

    private transient static final String SUMMARY = "The UK's largest independent producer of official statistics and the recognised national statistical institute of the UK.";

    public List<HomeSection> sections;

    public HomePage() {
        this.uri = ContentConstants.HOME_URI;
        this.title = ContentConstants.HOME_TITLE;
        this.summary = SUMMARY;
        buildBreadcrumb(null);
    }

    @Override
    public PageType getType() {
        return PageType.home_page;
    }

    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        if (sections == null) {
            return;
        }
        for (HomeSection section : sections) {
            section.loadReferences(contentService);
        }

    }
}
