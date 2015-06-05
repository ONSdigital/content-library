package com.github.onsdigital.content.taxonomy.statistic.base;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.taxonomy.home.base.TaxonomyHome;
import com.github.onsdigital.content.partial.Contact;

import java.net.URI;
import java.util.Date;

/**
 * Created by bren on 04/06/15.
 * <p>
 * <p>
 * Represents statistics that gets published, released and become a part of living taxonomy. Bulletin, Article, Timeseries, Dataset, etc.
 */
public abstract class Publication extends Content {

    //Metadata
    public boolean nationalStatistic;
    public Contact contact;
    public Date releaseDate;
    public Date nextReleaseDate;

    public Publication(String name, URI uri, String summary, ContentType type, TaxonomyHome parent) {
        super(name, uri, type, parent);
        this.summary = summary;
    }
}
