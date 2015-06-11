package com.github.onsdigital.content.page.statistics.document;

import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.statistics.document.base.StatisticalDocument;
import com.github.onsdigital.content.partial.metadata.Metadata;

import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Article extends StatisticalDocument {

    /*Metadata*/
    public String _abstract;
    public List<String> authors;


    /*Body*/
    public List<Metadata> relatedArticles;


    @Override
    public PageType getType() {
        return PageType.article;
    }

}
