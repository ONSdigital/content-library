package com.github.onsdigital.content.page.statistics.document.base;

import com.github.onsdigital.content.page.statistics.base.Statistics;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.partial.metadata.Metadata;

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
    public Metadata data;//Link to data in the article


    /*Migration Data*/
    public transient String theme;
    public transient String level2;
    public transient String level3;

}
