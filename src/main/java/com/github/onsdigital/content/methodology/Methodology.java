package com.github.onsdigital.content.methodology;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.Contact;
import com.github.onsdigital.content.partial.link.ContentLink;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.statistic.data.base.StatisticalData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Methodology extends Content {

    /*Metadata*/
    public Contact contact;

    /*Body*/
    public List<MarkdownSection> sections = new ArrayList<>();
    public List<MarkdownSection> accordion = new ArrayList<>();
    public ContentLink<StatisticalData> data;//Data in the article


    /*Migration Data - Only at time of migration*/
    public transient String theme;
    public transient String level2;
    public transient String level3;


    @Override
    public ContentType getType() {
        return ContentType.methodology;
    }
}
