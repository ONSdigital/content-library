package com.github.onsdigital.content.taxonomy;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.reference.ContentReference;
import com.github.onsdigital.content.taxonomy.base.TaxonomyPage;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Represents taxonomy landing page
 */
public class TaxonomyLandingPage extends TaxonomyPage{

    //Sections is not particularly a good name. Used for compatibility with Alpha website
    public List<ContentReference<TaxonomyPage>> sections = new ArrayList<>();

    public TaxonomyLandingPage(String name, URI uri, String summary, TaxonomyLandingPage parent) {
        super(name, uri, ContentType.taxonomy_landing_page, parent);
        this.summary = summary;
    }

    private TaxonomyLandingPage() {

    }

}
