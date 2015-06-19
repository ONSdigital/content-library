package com.github.onsdigital.content.page.home;

import com.github.onsdigital.content.page.base.PageDescription;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.taxonomy.base.TaxonomyPage;
import com.github.onsdigital.content.partial.HomeSection;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
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

    private MarkdownSection intro;

    private List<HomeSection> sections;

    public HomePage() {
        setUri(ContentConstants.HOME_URI);
        PageDescription description = new PageDescription();
        description.setTitle(ContentConstants.HOME_TITLE);
        intro = new MarkdownSection();
        intro.setTitle(ContentConstants.HOMEPAGE_INTRO_TITLE);
        intro.setMarkdown(ContentConstants.HOME_PAGE_INTRO_BODY);
        description.setSummary(ContentConstants.HOME_PAGE_INTRO_BODY);
        setDescription(description);
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

    public List<HomeSection> getSections() {
        return sections;
    }

    public void setSections(List<HomeSection> sections) {
        this.sections = sections;
    }

    public MarkdownSection getIntro() {
        return intro;
    }

    public void setIntro(MarkdownSection intro) {
        this.intro = intro;
    }
}
