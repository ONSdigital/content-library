package com.github.onsdigital.content.page.staticpage.base;

import com.github.onsdigital.content.link.Link;
import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageDescription;

import java.util.List;

/**
 * Created by bren on 29/06/15.
 */
public abstract class BaseStaticPage<T extends  PageDescription> extends Page {

    private List<Link> downloads;

    /**
     *Body of this static page in markdown format
     */
    private List<String> markdown;

    /**
     * Optional links showing up on right hand side of the page
     */
    private List<Link> links;

    public List<String> getMarkdown() {
        return markdown;
    }

    public void setMarkdown(List<String> markdown) {
        this.markdown = markdown;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<Link> getDownloads() {
        return downloads;
    }

    public void setDownloads(List<Link> downloads) {
        this.downloads = downloads;
    }
}
