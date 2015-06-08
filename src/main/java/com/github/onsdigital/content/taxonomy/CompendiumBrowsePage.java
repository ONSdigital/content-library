package com.github.onsdigital.content.taxonomy;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.taxonomy.base.TaxonomyPage;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 */
public class CompendiumBrowsePage extends TaxonomyPage {

    //TODO: Complete compendium object model. Content not quite clear yet
    public CompendiumBrowsePage(String name, URI uri, ProductPage parent) {
        super(name, uri, ContentType.compendium_browse_page, parent);
    }


    private  CompendiumBrowsePage() {

    }
}
