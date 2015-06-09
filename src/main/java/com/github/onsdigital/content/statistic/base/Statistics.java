package com.github.onsdigital.content.statistic.base;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.Contact;

import java.util.Date;

/**
 * Created by bren on 04/06/15.
 * <p>
 * <p>
 * Represents statistics that gets released periodically. Bulletin, Article, Timeseries, Dataset, etc.
 */
public abstract class Statistics extends Content {

    /*Metadata*/
    public boolean nationalStatistic;
    public Contact contact;
    public Date releaseDate;
    public Date nextReleaseDate;

    public Statistics(ContentType type) {
        super(type);
    }
}
