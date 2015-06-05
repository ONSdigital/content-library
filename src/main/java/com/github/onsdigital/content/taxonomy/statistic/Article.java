package com.github.onsdigital.content.taxonomy.statistic;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.taxonomy.statistic.base.Publication;
import com.github.onsdigital.content.taxonomy.home.ProductPage;

import java.net.URI;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Article extends Publication {

    //Metadata
    public String _abstract;
    public List<String> authors;

    public Article(String name, URI uri, String summary, ProductPage productPage) {
        super(name, uri, summary, ContentType.article, productPage);
    }
}
