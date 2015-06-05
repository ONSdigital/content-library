package com.github.onsdigital.content.taxonomy.statistic.compendium;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.taxonomy.statistic.base.Publication;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 */
public class Compendium extends Publication {
    public Compendium(String name, URI uri, String summary, CompendiumBrowsePage parent) {
        super(name, uri, summary, ContentType.compendium, parent);
    }
}
