package com.github.onsdigital.content.search;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageDescription;
import com.github.onsdigital.content.page.base.PageType;

import java.util.List;

/**
 * Created by bren on 29/06/15.
 */
public class SearchResult extends Content {

    private int numberOfResults;
    private List<PageReference> results;

    public List<PageReference> getResults() {
        return results;
    }

    public void setResults(List<PageReference> results) {
        this.results = results;
    }

    public int getNumberOfResults() {
        return numberOfResults;
    }

    public void setNumberOfResults(int numberOfResults) {
        this.numberOfResults = numberOfResults;
    }
}
