package com.github.onsdigital.content.taxonomy.statistic.data.base;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.taxonomy.statistic.base.Statistic;
import com.github.onsdigital.content.taxonomy.home.base.TaxonomyHome;

import java.net.URI;
import java.util.List;

/**
 * Created by bren on 05/06/15.
 */
public abstract class StatisticalData extends Statistic {

    /*Metadata*/
    public String cdid;

    // We provide a minimal default for the unit, otherwise hicharts shows
    // "undefined":
    public String unit = "";
    public String preUnit;

    /*Body*/
    public String description;//Markdown
    public List<String> notes;//Markdown

    public StatisticalData(String cdid, String name, URI uri, String summary, ContentType type, TaxonomyHome parent) {
        super(name, uri, summary, type, parent);
    }

    protected StatisticalData() {

    }
}
