package com.github.onsdigital.content.page.statistics.document.base;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.statistics.base.Statistics;
import com.github.onsdigital.content.page.statistics.base.StatisticsDescription;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 06/06/15.
 */
public abstract class StatisticalDocument<T extends StatisticsDescription> extends Statistics<T> {

    /*Body*/
    private List<MarkdownSection> sections = new ArrayList<>();
    private List<MarkdownSection> accordion = new ArrayList<>();
    private List<PageReference> relatedData = new ArrayList<>();//Link to data in the article

    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        ContentUtil.loadReferencedPageDescription(contentService, relatedData);
    }

    public List<MarkdownSection> getSections() {
        return sections;
    }

    public void setSections(List<MarkdownSection> sections) {
        this.sections = sections;
    }

    public List<MarkdownSection> getAccordion() {
        return accordion;
    }

    public void setAccordion(List<MarkdownSection> accordion) {
        this.accordion = accordion;
    }

    public List<PageReference> getRelatedData() {
        return relatedData;
    }

    public void setRelatedData(List<PageReference> relatedData) {
        this.relatedData = relatedData;
    }
}
