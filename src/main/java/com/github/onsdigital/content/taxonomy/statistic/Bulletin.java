package com.github.onsdigital.content.taxonomy.statistic;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.taxonomy.home.ProductPage;
import com.github.onsdigital.content.taxonomy.statistic.base.Publication;
import com.github.onsdigital.content.partial.markdown.Section;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Bulletin extends Publication {

    //Metadata
    public String headline1;
    public String headline2;
    public String headline3;


    //Content
    public List<Section> sections = new ArrayList<>();
    public List<Section> accordion = new ArrayList<>();


    public Bulletin(String name, URI uri, String summary, ProductPage productPage) {
        super(name, uri, summary, ContentType.bulletin, productPage);
    }
}
