package com.github.onsdigital.content.page.statistics.base;

import com.github.onsdigital.content.page.base.PageDescription;
import com.github.onsdigital.content.partial.Contact;

import java.util.Date;

public class StatisticsDescription extends PageDescription {
    private boolean nationalStatistic;
    private Contact contact;
    private Date releaseDate;
    private String nextRelease;
    private String language;


    /*Migration Data*/
    public transient String theme;
    public transient String level2;
    public transient String level3;

    public boolean isNationalStatistic() {
        return nationalStatistic;
    }

    public void setNationalStatistic(boolean nationalStatistic) {
        this.nationalStatistic = nationalStatistic;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getNextRelease() {
        return nextRelease;
    }

    public void setNextRelease(String nextRelease) {
        this.nextRelease = nextRelease;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}