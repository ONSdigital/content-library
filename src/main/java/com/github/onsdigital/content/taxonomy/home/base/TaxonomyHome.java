package com.github.onsdigital.content.taxonomy.home.base;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 *
 * Represents a home page in the taxonomy - T1-T3.
 *
 * @author david
 * @author bren
 */
public class TaxonomyHome extends Content {

    public TaxonomyHome(String name, URI uri, ContentType type, TaxonomyHome parent) {
        super(name, uri, type, parent);
    }
}
