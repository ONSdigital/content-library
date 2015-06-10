package com.github.onsdigital.content.taxonomy;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.reference.ContentReference;
import com.github.onsdigital.content.taxonomy.base.TaxonomyNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Represents taxonomy landing page
 */
public class TaxonomyLandingPage extends TaxonomyNode {

    //Sections is not particularly a good name. Used for compatibility with Alpha website
    public List<ContentReference<TaxonomyNode>> sections = new ArrayList<>();

    @Override
    public ContentType getType() {
        return ContentType.taxonomy_landing_page;
    }
}
