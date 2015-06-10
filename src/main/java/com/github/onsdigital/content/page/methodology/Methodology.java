package com.github.onsdigital.content.page.methodology;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.partial.Contact;
import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.page.statistics.data.base.StatisticalData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Methodology extends Page {

    /*Metadata*/
    public Contact contact;

    /*Body*/
    public List<MarkdownSection> sections = new ArrayList<>();
    public List<MarkdownSection> accordion = new ArrayList<>();
    public PageReference data;//Data in the article


    /*Migration Data - Only at time of migration*/
    public transient String theme;
    public transient String level2;
    public transient String level3;


    @Override
    public PageType getType() {
        return PageType.methodology;
    }
}
