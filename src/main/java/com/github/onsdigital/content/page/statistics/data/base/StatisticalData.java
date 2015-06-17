package com.github.onsdigital.content.page.statistics.data.base;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.PageDescription;
import com.github.onsdigital.content.page.statistics.base.Statistics;
import com.github.onsdigital.content.page.statistics.base.StatisticsDescription;
import com.github.onsdigital.content.page.statistics.dataset.DatasetDescription;
import com.github.onsdigital.content.page.statistics.document.base.StatisticalDocument;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.util.List;

/**
 * Created by bren on 05/06/15.
 */
public abstract class StatisticalData<T extends StatisticalDataDescription> extends Statistics<T> {

    /*Body*/
    private List<PageReference> relatedDatasets;
    private MarkdownSection section; //Explanatory section
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

    public MarkdownSection getSection() {
        return section;
    }

    public void setSection(MarkdownSection section) {
        this.section = section;
    }
}
