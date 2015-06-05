package com.github.onsdigital.content.methodology;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.Contact;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 */
public class Methodology extends Content {

    public Contact contact;

    public Methodology(String name, URI uri, String summary, MethodologyBrowsePage parent) {
        super(name, uri, ContentType.methodology, parent);
        this.summary = summary;
    }
}
