package com.github.onsdigital.content.statistic;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.taxonomy.CompendiumBrowsePage;
import com.github.onsdigital.content.statistic.base.Statistics;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 */
public class Compendium extends Statistics {

    //TODO: Complete compendium object model. Content not quite clear yet

    public Compendium(String name, URI uri, String summary, CompendiumBrowsePage parent) {
        super(name, uri, summary, ContentType.compendium, parent);
    }

    private Compendium() {

    }
}
