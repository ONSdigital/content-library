package com.github.onsdigital.content.page.statistics.dataset;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.statistics.base.Statistics;
import com.github.onsdigital.content.partial.DownloadSection;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Dataset extends Statistics<DatasetDescription> {

    //TODO: Currently using mostly the same fields as Alpha. Workout complex data pages

    /*Body*/
    private List<DownloadSection> downloads = new ArrayList<DownloadSection>();
    private List<PageReference> relatedMethodology;
    private MarkdownSection section;
    private List<MarkdownSection> notes;
    private List<PageReference> relatedDatasets;
    private List<PageReference> relatedDocuments;


    @Override
    public PageType getType() {
        return PageType.dataset;
    }

    public List<DownloadSection> getDownloads() {
        return downloads;
    }

    public void setDownloads(List<DownloadSection> downloads) {
        this.downloads = downloads;
    }

    public List<MarkdownSection> getNotes() {
        return notes;
    }

    public void setNotes(List<MarkdownSection> notes) {
        this.notes = notes;
    }

    public MarkdownSection getSection() {
        return section;
    }

    public void setSection(MarkdownSection section) {
        this.section = section;
    }

    public List<PageReference> getRelatedMethodology() {
        return relatedMethodology;
    }

    public void setRelatedMethodology(List<PageReference> relatedMethodology) {
        this.relatedMethodology = relatedMethodology;
    }

    public List<PageReference> getRelatedDatasets() {
        return relatedDatasets;
    }

    public void setRelatedDatasets(List<PageReference> relatedDatasets) {
        this.relatedDatasets = relatedDatasets;
    }

    public List<PageReference> getRelatedDocuments() {
        return relatedDocuments;
    }

    public void setRelatedDocuments(List<PageReference> relatedDocuments) {
        this.relatedDocuments = relatedDocuments;
    }
}
