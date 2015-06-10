package com.github.onsdigital.content.statistic.document;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.reference.ContentReference;
import com.github.onsdigital.content.statistic.document.base.StatisticalDocument;

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


    @Override
    public ContentType getType() {
        return ContentType.article;
    }

}
