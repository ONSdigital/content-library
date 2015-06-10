package com.github.onsdigital.content.adhoc;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;

import java.util.Date;

/**
 * Created by bren on 04/06/15.
 */
public class AdHoc extends Content {

    public Date releaseDate;
    public int reference;


    @Override
    public ContentType getType() {
        return ContentType.adhoc;
    }
}
