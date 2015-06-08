package com.github.onsdigital.content.release;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.Contact;
import com.github.onsdigital.content.partial.reference.ContentReference;
import com.github.onsdigital.content.statistic.Dataset;
import com.github.onsdigital.content.statistic.document.Article;
import com.github.onsdigital.content.statistic.document.Bulletin;
import com.github.onsdigital.content.taxonomy.ProductPage;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Release extends Content {

    /*Metadata*/
    public Contact contact;
    public Date releaseDate;
    public Date nextReleaseDate;
    public boolean nationalStatistics;


    public List<ContentReference<Article>> articles = new ArrayList<ContentReference<Article>>();
    public List<ContentReference<Bulletin>> bulletins = new ArrayList<ContentReference<Bulletin>>();
    public List<ContentReference<Dataset>> datasets = new ArrayList<ContentReference<Dataset>>();


    public Release(ProductPage productPage, URI uri) {
        super(productPage.title, uri, ContentType.release, new ReleaseCalendar());
        this.summary = productPage.summary;
    }

    private Release() {
    }
}
