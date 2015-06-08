package com.github.onsdigital.content.statistic.base;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.Contact;
import com.github.onsdigital.content.taxonomy.base.TaxonomyPage;

import java.net.URI;
import java.util.Date;

/**
 * Created by bren on 04/06/15.
 * <p>
 * <p>
 * Represents statistics that gets published, released and become a part of living taxonomy. Bulletin, Article, Timeseries, Dataset, etc.
 */
public abstract class Statistics extends Content {

    /*Metadata*/
    public boolean nationalStatistic;
    public Contact contact;
    public Date releaseDate;
    public Date nextReleaseDate;

    public Statistics(String name, URI uri, String summary, ContentType type, TaxonomyPage parent) {
        super(name, uri, type, parent);
        this.summary = summary;
    }

    protected Statistics() {

    }
}
