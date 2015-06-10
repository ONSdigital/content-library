package com.github.onsdigital.content.aboutus;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;

import java.util.Date;

/**
 * Created by bren on 04/06/15.
 */
public class FOI extends Content {

    public Date releaseDate;

    @Override
    public ContentType getType() {
        return ContentType.foi;
    }
}
