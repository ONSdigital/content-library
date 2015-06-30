package com.github.onsdigital.content.page.list;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.partial.SearchResult;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

public class ListPage extends Page {

    private String h2;
    private String frequency = "Monthly";

    private SearchResult contentSearchResult;

    @Override
    public PageType getType() {
        return PageType.list_page;
    }

    public SearchResult getContentSearchResult() {
        return contentSearchResult;
    }

    public void setContentSearchResult(SearchResult contentSearchResult) {
        this.contentSearchResult = contentSearchResult;
    }

    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        ContentUtil.loadReferencedPageDescription(contentService, this.contentSearchResult.getResults());
    }
}
