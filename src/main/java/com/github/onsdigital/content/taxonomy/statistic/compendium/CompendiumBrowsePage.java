package com.github.onsdigital.content.taxonomy.statistic.compendium;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.taxonomy.home.TaxonomyLandingPage;
import com.github.onsdigital.content.taxonomy.home.base.TaxonomyHome;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 */
public class CompendiumBrowsePage extends TaxonomyHome {
    public CompendiumBrowsePage(String name, URI uri, TaxonomyLandingPage parent) {
        super(name, uri, ContentType.compendium_browse_page, parent);
    }
}
