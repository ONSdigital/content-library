package com.github.onsdigital.content.home;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.HomeSection;

import java.net.URI;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Object mapping for homepage of the website
 * <p>
 * HomePage is considered as the root of Taxonomy. It also contains links and references to non-statistics contents (Methodology, Release, About Us pages , etc.)
 */
public class HomePage extends Content {

    private transient static final URI HOME_URI = URI.create("/");
    private transient static final String NAME = "Home";

    public List<HomeSection> sections;

    public HomePage() {
        super(NAME, HOME_URI, ContentType.home_page, null);
    }

}
