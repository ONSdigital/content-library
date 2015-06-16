package com.github.onsdigital.content.page.aboutus;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;

import java.util.Date;

/**
 * Created by bren on 04/06/15.
 */
public class FOI extends Page {

    //TODO: Descriptions for new content type
    private Date releaseDate;

    @Override
    public PageType getType() {
        return PageType.foi;
    }
}
