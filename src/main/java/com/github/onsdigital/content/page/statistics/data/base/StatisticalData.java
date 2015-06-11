package com.github.onsdigital.content.page.statistics.data.base;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.statistics.base.Statistics;
import com.github.onsdigital.content.partial.metadata.Metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 05/06/15.
 */
public abstract class StatisticalData extends Statistics {

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
    public List<PageReference> relatedDatasets;

    public String description;//Markdown
    public List<String> notes = new ArrayList<String>();//Markdown

    public List<Metadata> relatedDocuments = new ArrayList<>();

    public List<Metadata> methodology;

}
