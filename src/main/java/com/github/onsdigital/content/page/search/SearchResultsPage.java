package com.github.onsdigital.content.page.search;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.taxonomy.ProductPage;
import com.github.onsdigital.content.partial.SearchResult;

import java.util.List;

/**
 * Created by bren on 29/06/15.
 */
public class SearchResultsPage extends Page {

    private SearchResult taxonomySearchResult;
    private SearchResult statisticsSearchResult;
    private String searchTerm;
    //When search is autocorrected
    private boolean suggestionBased;
    private String suggestion;
    private int currentPage;
    private int startPage;
    private int endPage;
    private List<Integer> pages;
    private long numberOfResults;
    private ProductPage headlinePage;
    private long numberOfPages;
    private String[] types;
    private boolean includeAllData;
    private boolean includeStatics;


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

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public PageType getType() {
        return PageType.search_results_page;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public long getNumberOfResults() {
        return numberOfResults;
    }

    public void setNumberOfResults(long numberOfResults) {
        this.numberOfResults = numberOfResults;
    }

    public ProductPage getHeadlinePage() {
        return headlinePage;
    }

    public void setHeadlinePage(ProductPage headlinePage) {
        this.headlinePage = headlinePage;
    }

    public long getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(long numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public boolean isIncludeStatics() {
        return includeStatics;
    }

    public void setIncludeStatics(boolean includeStatics) {
        this.includeStatics = includeStatics;
    }

    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public List<Integer> getPages() {
        return pages;
    }

    public void setPages(List<Integer> pages) {
        this.pages = pages;
    }

    public boolean isIncludeAllData() {
        return includeAllData;
    }

    public void setIncludeAllData(boolean includeAllData) {
        this.includeAllData = includeAllData;
    }
}
