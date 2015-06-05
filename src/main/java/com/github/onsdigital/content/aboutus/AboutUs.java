package com.github.onsdigital.content.aboutus;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 */
public class AboutUs extends Content {
    public AboutUs(String name, URI uri, AboutUsBrowsePage parent) {
        super(name, uri, ContentType.about_us, parent);
    }

    private AboutUs() {

    }
}
