package com.github.onsdigital.content.page.search;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;

/**
 * Created by bren on 29/06/15.
 */
public class SearchResultsPage extends Page {

    private SearchResult taxonomySearchResult;
    private SearchResult statisticsSearchResult;
    private String searchTerm;
    //When search is autocorrected
    private boolean suggestionBased;
    private boolean suggestion;
    private boolean currentPage;

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

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public boolean isSuggestionBased() {
        return suggestionBased;
    }

    public void setSuggestionBased(boolean suggestionBased) {
        this.suggestionBased = suggestionBased;
    }

    public boolean isSuggestion() {
        return suggestion;
    }

    public void setSuggestion(boolean suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public PageType getType() {
        return PageType.search_results_page;
    }

    public boolean isCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(boolean currentPage) {
        this.currentPage = currentPage;
    }
}
