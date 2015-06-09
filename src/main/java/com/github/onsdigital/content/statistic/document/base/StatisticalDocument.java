package com.github.onsdigital.content.statistic.document.base;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.link.ContentLink;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.statistic.base.Statistics;
import com.github.onsdigital.content.statistic.data.base.StatisticalData;
import com.github.onsdigital.content.taxonomy.ProductPage;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 06/06/15.
 */
public abstract class StatisticalDocument extends Statistics {


    /*Metadata*/

    /*Body*/
    public List<MarkdownSection> sections = new ArrayList<>();
    public List<MarkdownSection> accordion = new ArrayList<>();
    public ContentLink<StatisticalData> data;//Link to data in the article


    /*Migration Data*/
    public transient String theme;
    public transient String level2;
    public transient String level3;


    public StatisticalDocument(ContentType contentType) {
        super(contentType);
    }
}
