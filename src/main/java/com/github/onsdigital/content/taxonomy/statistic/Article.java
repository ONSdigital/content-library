package com.github.onsdigital.content.taxonomy.statistic;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.link.ContentLink;
import com.github.onsdigital.content.partial.reference.ContentReference;
import com.github.onsdigital.content.taxonomy.statistic.base.Statistic;
import com.github.onsdigital.content.taxonomy.home.ProductPage;
import com.github.onsdigital.content.taxonomy.statistic.data.base.StatisticalData;

import java.net.URI;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Article extends Statistic {

    /*Metadata*/
    public String _abstract;
    public List<String> authors;


    /*Body*/
    public ContentLink<StatisticalData> data;//Data in the article
    public List<ContentReference<Article>> relatedArticles;


    public Article(String name, URI uri, String summary, ProductPage productPage) {
        super(name, uri, summary, ContentType.article, productPage);
    }


    private Article() {

    }
}
