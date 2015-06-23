package com.github.onsdigital.content.page.statistics.document.tmp;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;

public class Chart extends Page<ChartDescription> {

    private String title;
    private String subtitle;
    private String filename;
    private String source;
    private String notes;
    private String altText;

    @Override
    public PageType getType() {
        return PageType.chart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }
}
