package com.github.onsdigital.content.partial;

import com.github.onsdigital.content.link.PageReference;

import java.util.List;

public class SearchResult {

    private int numberOfResults;
    private List<PageReference> results;

    public int getNumberOfResults() {
        return numberOfResults;
    }

    public void setNumberOfResults(int numberOfResults) {
        this.numberOfResults = numberOfResults;
    }

    public List<PageReference> getResults() {
        return results;
    }

    public void setResults(List<PageReference> results) {
        this.results = results;
    }

}
