package com.github.onsdigital.content.partial.navigation;

import com.github.onsdigital.content.page.taxonomy.base.TaxonomyPage;
import com.github.onsdigital.content.partial.metadata.Metadata;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 10/06/15.
 */
public class NavigationNode implements  Comparable<NavigationNode> {

    public String title;
    public URI uri;
    public Integer index;

    public transient String fileName;

    public List<NavigationNode> children;

    public NavigationNode() {
    }

    public NavigationNode(TaxonomyPage taxonomyPage) {
        this.uri = taxonomyPage.uri;
        this.title = taxonomyPage.title;
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

