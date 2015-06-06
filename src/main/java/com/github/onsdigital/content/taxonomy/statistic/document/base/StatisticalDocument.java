package com.github.onsdigital.content.taxonomy.statistic.document.base;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.link.ContentLink;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.taxonomy.home.base.TaxonomyHome;
import com.github.onsdigital.content.taxonomy.statistic.base.Statistic;
import com.github.onsdigital.content.taxonomy.statistic.data.base.StatisticalData;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 06/06/15.
 */
public abstract class StatisticalDocument extends Statistic {


    /*Metadata*/

    /*Body*/
    public List<MarkdownSection> sections = new ArrayList<>();
    public List<MarkdownSection> accordion = new ArrayList<>();
    public ContentLink<StatisticalData> data;//Data in the article



    public StatisticalDocument(String name, URI uri, String summary, ContentType type, TaxonomyHome parent) {
        super(name, uri, summary, type, parent);
    }


    protected StatisticalDocument() {

    }
}
