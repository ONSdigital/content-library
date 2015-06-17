package com.github.onsdigital.content.page.base;

import com.github.onsdigital.content.base.ContentDescription;

import java.util.List;

/**
 * Created by bren on 04/06/15.
 * <p>
 *  Represents description of any page type with minimal fields.
 * <p>
 */
public class PageDescription  extends ContentDescription implements Comparable<PageDescription>  {

    //Index is used for ordering if set
    private Integer index;
    private String title;
    //Below fields are not common for all page types. But there is no immediate generic type to put these fields in
    //These fields won't be serialised into json if empty
    private String summary;
    private List<String> keywords; //Used for search engines to read ?
    private String metaDescription;

    public PageDescription() {
    }

    @Override
    public int compareTo(PageDescription o) {
        //nulls last or first
        if (this.index == null) {
            return -1;
        }
        return Integer.compare(this.index, o.index);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }
}
