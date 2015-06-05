package com.github.onsdigital.content.taxonomy.home;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.taxonomy.home.base.TaxonomyHome;
import com.github.onsdigital.content.partial.reference.ContentReference;

import java.net.URI;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Represents taxonomy landing page - level 2
 */
public class TaxonomyLandingPage extends TaxonomyHome {

    //Sections is not particularly a good name. Used for compatibility with Alpha website
    public List<ContentReference<TaxonomyHome>> sections;

    public TaxonomyLandingPage(String name, URI uri, String summary, TaxonomyHome parent) {
        super(name, uri, ContentType.taxonomy_browse_page, parent);
        this.summary = summary;
    }


    private TaxonomyLandingPage() {

    }

}
