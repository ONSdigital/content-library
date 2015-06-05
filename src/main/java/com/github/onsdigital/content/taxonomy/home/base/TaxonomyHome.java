package com.github.onsdigital.content.taxonomy.home.base;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Represents a home page in the taxonomy - T1-T3.
 *
 * @author david
 * @author bren
 */
public class TaxonomyHome extends Content {


    /**
     * Public constructor enforces required information for setting up the hierarchy and location to be passed into objects.
     * Which in turn should eliminate coding errors involving missing information at development time.
     * <p>
     * serialize/deserialize utils on the other hand should use private constructors (via Reflection)
     * <p>
     * Objects should still be asserted for missing information after Deserializing
     *
     * @param name   Name/Title of this content
     * @param uri    Uri of the content
     * @param parent Parent content which gives access to this content
     */
    public TaxonomyHome(String name, URI uri, ContentType type, TaxonomyHome parent) {
        super(name, uri, type, parent);
    }


    protected TaxonomyHome() {

    }
}
