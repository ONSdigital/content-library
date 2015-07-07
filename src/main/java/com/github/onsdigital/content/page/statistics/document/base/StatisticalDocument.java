package com.github.onsdigital.content.page.statistics.document.base;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.statistics.base.Statistics;
import com.github.onsdigital.content.partial.FigureSection;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 06/06/15.
 */
public abstract class StatisticalDocument extends Statistics {

    /*Body*/
    private List<MarkdownSection> sections = new ArrayList<>();
    private List<MarkdownSection> accordion = new ArrayList<>();
    private List<PageReference> relatedData = new ArrayList<>();//Link to data in the article
    private List<FigureSection> charts = new ArrayList<>();
    private List<FigureSection> tables = new ArrayList<>();

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

    public List<FigureSection> getCharts() { return charts; }

    public void setCharts(List<FigureSection> charts) { this.charts = charts; }

    public List<FigureSection> getTables() { return tables; }

    public void setTables(List<FigureSection> tables) { this.tables = tables; }
}
