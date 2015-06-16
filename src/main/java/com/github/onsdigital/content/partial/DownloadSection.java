package com.github.onsdigital.content.partial;

import com.github.onsdigital.content.base.Content;

import java.util.List;

/**
 * Represents a section in a dataset for downloading
 */

//TODO: Get rid of old Alpha sections (Almost time to think about resources ( pdf,csv etc ).)
public class DownloadSection extends Content {
    private String title;
    private List<String> cdids;
    private String xls;
    private String csv;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getCdids() {
        return cdids;
    }

    public void setCdids(List<String> cdids) {
        this.cdids = cdids;
    }

    public String getXls() {
        return xls;
    }

    public void setXls(String xls) {
        this.xls = xls;
    }

    public String getCsv() {
        return csv;
    }

    public void setCsv(String csv) {
        this.csv = csv;
    }
}
