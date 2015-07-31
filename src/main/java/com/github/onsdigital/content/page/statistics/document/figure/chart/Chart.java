package com.github.onsdigital.content.page.statistics.document.figure.chart;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;

import java.util.Map;

public class Chart extends Page {

    private String title;
    private String subtitle;
    private String filename;
    private String unit;
    private String source;
    private String notes;
    private String altText;

    private String chartType;
    private String aspectRatio;
    private String[] series;
    private String[] categories;
    private Map<String, String>[] data;
    private Map<String, String> chartTypes;
    private String[][] groups;
    private String decimalPlaces;
    private String labelInterval;

    @Override
    public PageType getType() {
        return PageType.chart;
    }

    public String getUnit() { return unit; }

    public void setUnit(String unit) { this.unit = unit; }

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

    public String getChartType() {
        return chartType;
    }

    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String[] getSeries() {
        return series;
    }

    public void setSeries(String[] series) {
        this.series = series;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public Map<String, String>[] getData() {
        return data;
    }

    public void setData(Map<String, String>[] data) {
        this.data = data;
    }

    public String getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(String decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public String getLabelInterval() {
        return labelInterval;
    }

    public void setLabelInterval(String labelInterval) {
        this.labelInterval = labelInterval;
    }

    public Map<String, String> getChartTypes() {
        return chartTypes;
    }

    public void setChartTypes(Map<String, String> chartTypes) {
        this.chartTypes = chartTypes;
    }

    public String[][] getGroups() {
        return groups;
    }

    public void setGroups(String[][] groups) {
        this.groups = groups;
    }

    // helper methods to encapsulate string configurations
    public boolean isRotated() { return getChartType().equals("rotated"); }
    public boolean isBarLine() { return getChartType().equals("barline"); }
}
