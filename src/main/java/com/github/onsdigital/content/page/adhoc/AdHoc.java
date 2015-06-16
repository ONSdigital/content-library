package com.github.onsdigital.content.page.adhoc;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;

import java.util.Date;

/**
 * Created by bren on 04/06/15.
 */
public class AdHoc extends Page {

    private Date releaseDate;
    private int reference;

    @Override
    public PageType getType() {
        return PageType.adhoc;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }
}
