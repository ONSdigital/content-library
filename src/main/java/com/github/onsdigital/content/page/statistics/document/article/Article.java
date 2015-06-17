package com.github.onsdigital.content.page.statistics.document.article;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.statistics.document.base.StatisticalDocument;
import com.github.onsdigital.content.page.base.PageDescription;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Article extends StatisticalDocument<ArticleDescription> {

    /*Body*/
    private List<PageReference> relatedArticles;

    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        ContentUtil.loadReferencedPageDescription(contentService, relatedArticles);
    }

    @Override
    public PageType getType() {
        return PageType.article;
    }

}
