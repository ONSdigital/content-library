package com.github.onsdigital.content.page.release;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageDescription;
import com.github.onsdigital.content.partial.Contact;

import java.util.Date;

/**
 * Created by bren on 16/06/15.
 */
public class ReleaseDescription extends PageDescription {

    private Contact contact;
    private Date releaseDate;
    private Date nextReleaseDate;
    private boolean nationalStatistics;

    public ReleaseDescription() {

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

    public Date getNextReleaseDate() {
        return nextReleaseDate;
    }

    public void setNextReleaseDate(Date nextReleaseDate) {
        this.nextReleaseDate = nextReleaseDate;
    }

    public boolean isNationalStatistics() {
        return nationalStatistics;
    }

    public void setNationalStatistics(boolean nationalStatistics) {
        this.nationalStatistics = nationalStatistics;
    }
}
