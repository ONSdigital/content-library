package com.github.onsdigital.content.home;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.HomeSection;
import com.github.onsdigital.content.taxonomy.base.TaxonomyNode;

import java.net.URI;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Object mapping for homepage of the website
 * <p>
 * HomePage is considered as the root of Taxonomy. It also contains links and references to non-statistics contents (Methodology, Release, About Us pages , etc.)
 */
public class HomePage extends TaxonomyNode {

    private transient static final URI HOME_URI = URI.create("/");
    private transient static final String NAME = "Home";
    private transient static final String SUMMARY = "The UK's largest independent producer of official statistics and the recognised national statistical institute of the UK.";

    public List<HomeSection> sections;

    public HomePage() {
        this.uri = HOME_URI;
        this.title = NAME;
        this.summary = SUMMARY;
        buildBreadcrumb(null);
    }

    @Override
    public ContentType getType() {
        return ContentType.home_page;
    }
}
