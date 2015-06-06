package com.github.onsdigital.content.taxonomy.statistic.data.base;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.methodology.Methodology;
import com.github.onsdigital.content.partial.link.ContentLink;
import com.github.onsdigital.content.taxonomy.statistic.Dataset;
import com.github.onsdigital.content.taxonomy.statistic.base.Statistic;
import com.github.onsdigital.content.taxonomy.home.base.TaxonomyHome;
import com.github.onsdigital.content.taxonomy.statistic.data.TimeSeries;
import com.github.onsdigital.content.taxonomy.statistic.document.base.StatisticalDocument;

import java.net.URI;
import java.util.List;

/**
 * Created by bren on 05/06/15.
 */
public abstract class StatisticalData extends Statistic {

    /*Metadata*/
    public String cdid;

    // We provide a minimal default for the unit, otherwise highcharts shows
    // "undefined":
    public String unit = "";
    public String preUnit = "";


    /**
     * Where a statistic comes from. Typically "Office for National Statistics"
     */
    //TODO: Read this piece of info from metadata
    public String source = "Office for National Statistics";


    /*Body*/
    public List<ContentLink<Dataset>> relatedDatasets;

    public String description;//Markdown
    public List<String> notes;//Markdown

    public List<ContentLink<StatisticalDocument>> relatedDocuments;

    public List<ContentLink<Methodology>> methodology;

    public StatisticalData(String cdid, String name, URI uri, String summary, ContentType type, TaxonomyHome parent) {
        super(name, uri, summary, type, parent);
    }

    protected StatisticalData() {

    }
}
