package com.github.onsdigital.content.page.adhoc;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;

import java.util.Date;

/**
 * Created by bren on 04/06/15.
 */
public class AdHoc extends Page {

    public Date releaseDate;
    public int reference;


    @Override
    public PageType getType() {
        return PageType.adhoc;
    }
}
