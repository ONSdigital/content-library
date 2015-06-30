package com.github.onsdigital.content.search;

import com.github.onsdigital.content.base.Content;

/**
 * Created by bren on 29/06/15.
 */
public class AggregatedSearchResults extends Content {

    private SearchResult taxonomySearchResult;
    private SearchResult statisticsSearchResult;
    private boolean suggestionBasedResult;

    public SearchResult getTaxonomySearchResult() {
        return taxonomySearchResult;
    }

    public void setTaxonomySearchResult(SearchResult taxonomySearchResult) {
        this.taxonomySearchResult = taxonomySearchResult;
    }

    public SearchResult getStatisticsSearchResult() {
        return statisticsSearchResult;
    }

    public void setStatisticsSearchResult(SearchResult statisticsSearchResult) {
        this.statisticsSearchResult = statisticsSearchResult;
    }

    public boolean isSuggestionBasedResult() {
        return suggestionBasedResult;
    }

    public void setSuggestionBasedResult(boolean suggestionBasedResult) {
        this.suggestionBasedResult = suggestionBasedResult;
    }
}
