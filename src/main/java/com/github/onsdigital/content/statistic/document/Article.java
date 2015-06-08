package com.github.onsdigital.content.statistic.document;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.reference.ContentReference;
import com.github.onsdigital.content.taxonomy.ProductPage;
import com.github.onsdigital.content.statistic.document.base.StatisticalDocument;

import java.net.URI;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Article extends StatisticalDocument {

    /*Metadata*/
    public String _abstract;
    public List<String> authors;


    /*Body*/
    public List<ContentReference<Article>> relatedArticles;


    public Article(String name, URI uri, String summary, ProductPage productPage) {
        super(name, uri, summary, ContentType.article, productPage);
    }


    private Article() {

    }
}
