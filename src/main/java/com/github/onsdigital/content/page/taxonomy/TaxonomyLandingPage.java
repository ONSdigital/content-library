package com.github.onsdigital.content.page.taxonomy;

import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.taxonomy.base.TaxonomyPage;
import com.github.onsdigital.content.partial.metadata.Metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Represents taxonomy landing page
 */
public class TaxonomyLandingPage extends TaxonomyPage {

    //Sections is not particularly a good name. Used for compatibility with Alpha website
    public List<Metadata> sections = new ArrayList<>();

    @Override
    public PageType getType() {
        return PageType.taxonomy_landing_page;
    }

}
