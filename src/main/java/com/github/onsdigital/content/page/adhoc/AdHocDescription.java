package com.github.onsdigital.content.page.adhoc;

import com.github.onsdigital.content.page.base.PageDescription;

import java.util.Date;

/**
 * Created by bren on 30/06/15.
 */
public class AdHocDescription extends PageDescription {

    private Date releaseDate;
    private String reference;

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
