package com.github.onsdigital.content.aboutus;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 */
public class AboutUsBrowsePage extends Content {

    public AboutUsBrowsePage(String name, URI uri, Content parent) {
        super(name, uri, ContentType.about_us_browse_page, parent);
    }

    private AboutUsBrowsePage() {
        
    }
}
