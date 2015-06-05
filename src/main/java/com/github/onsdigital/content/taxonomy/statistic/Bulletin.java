package com.github.onsdigital.content.taxonomy.statistic;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.reference.BulletinReference;
import com.github.onsdigital.content.partial.link.ContentLink;
import com.github.onsdigital.content.taxonomy.home.ProductPage;
import com.github.onsdigital.content.taxonomy.statistic.base.Statistic;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.taxonomy.statistic.data.base.StatisticalData;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Bulletin extends Statistic {

    /*Metadata*/
    public String[] headlines;

    /*Body*/
    public List<MarkdownSection> sections = new ArrayList<>();
    public List<MarkdownSection> accordion = new ArrayList<>();
    public List<ContentLink<StatisticalData>> data;//Data in the bulletin
    public List<BulletinReference> relatedBulletins;


    public Bulletin(String name, URI uri, String summary, ProductPage productPage) {
        super(name, uri, summary, ContentType.bulletin, productPage);
    }

    private Bulletin() {

    }
}
