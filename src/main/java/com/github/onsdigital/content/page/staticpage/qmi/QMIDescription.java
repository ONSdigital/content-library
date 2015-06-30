package com.github.onsdigital.content.page.staticpage.qmi;

import com.github.onsdigital.content.page.base.PageDescription;
import com.github.onsdigital.content.partial.Contact;

import java.util.Date;

/**
 * Created by bren on 30/06/15.
 */
public class QMIDescription extends PageDescription {
    private Contact contact;
    private String surveyName;
    private String frequency;
    private String compilation;
    private String geographicCoverage;
    private int sampleSize;
    private Date lastRevised;


    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getCompilation() {
        return compilation;
    }

    public void setCompilation(String compilation) {
        this.compilation = compilation;
    }

    public String getGeographicCoverage() {
        return geographicCoverage;
    }

    public void setGeographicCoverage(String geographicCoverage) {
        this.geographicCoverage = geographicCoverage;
    }

    public int getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(int sampleSize) {
        this.sampleSize = sampleSize;
    }

    public Date getLastRevised() {
        return lastRevised;
    }

    public void setLastRevised(Date lastRevised) {
        this.lastRevised = lastRevised;
    }
}
