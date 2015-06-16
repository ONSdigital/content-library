package com.github.onsdigital.content.page.statistics.data.base;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.PageDescription;
import com.github.onsdigital.content.page.statistics.base.Statistics;
import com.github.onsdigital.content.page.statistics.base.StatisticsDescription;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.util.List;

/**
 * Created by bren on 05/06/15.
 */
public abstract class StatisticalData extends Statistics {

    /*Body*/
    private List<PageReference> relatedDatasets;
    private List<String> notes;//Markdown
    private List<PageReference> relatedDocuments;
    private List<PageReference> methodology;

    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        ContentUtil.loadReferencedPageDescription(contentService, relatedDatasets);
        ContentUtil.loadReferencedPageDescription(contentService, relatedDocuments);
        ContentUtil.loadReferencedPageDescription(contentService, methodology);
    }

    @Override
    public StatisticalDataDescription getDescription() {
        return (StatisticalDataDescription) super.getDescription();
    }

    public void setDescription(StatisticalDataDescription description) {
        super.setDescription(description);
    }

    public List<PageReference> getRelatedDocuments() {
        return relatedDocuments;
    }

    public void setRelatedDocuments(List<PageReference> relatedDocuments) {
        this.relatedDocuments = relatedDocuments;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }
}
