package com.github.onsdigital.content.methodology;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.home.HomePage;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 */
public class MethodologyBrowsePage extends Content {
    public MethodologyBrowsePage(String name, URI uri, HomePage parent) {
        super(name, uri, ContentType.methodology_browse_page, parent);
    }
}
