package com.github.onsdigital.content.partial.navigation;

import com.github.onsdigital.content.page.taxonomy.base.TaxonomyPage;

import java.net.URI;
import java.util.List;

/**
 * Created by bren on 10/06/15.
 */
public class NavigationNode implements  Comparable<NavigationNode> {

    private String title;
    private URI uri;
    private Integer index;

    public transient String fileName;

    public List<NavigationNode> children;

    public NavigationNode() {
    }

    public NavigationNode(TaxonomyPage taxonomyPage) {
        this.uri = taxonomyPage.getUri();
        this.title = taxonomyPage.getDescription().getTitle();
        this.index = taxonomyPage.getIndex();
    }

    @Override
    public int compareTo(NavigationNode o) {
        //nulls last or first
        if (this.index == null) {
            return -1;
        }
        return Integer.compare(this.index, o.index);
    }

}

