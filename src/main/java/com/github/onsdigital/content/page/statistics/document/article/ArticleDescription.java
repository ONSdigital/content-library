package com.github.onsdigital.content.page.statistics.document.article;

import com.github.onsdigital.content.page.statistics.base.StatisticsDescription;

import java.util.List;

/**
 * Created by bren on 16/06/15.
 */
public class ArticleDescription extends StatisticsDescription {

    private String _abstract;
    private List<String> authors;

    public String get_abstract() {
        return _abstract;
    }

    public void set_abstract(String _abstract) {
        this._abstract = _abstract;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
