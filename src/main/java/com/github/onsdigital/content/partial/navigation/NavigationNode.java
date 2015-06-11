package com.github.onsdigital.content.partial.navigation;

import com.github.onsdigital.content.page.taxonomy.base.TaxonomyPage;
import com.github.onsdigital.content.partial.metadata.Metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 10/06/15.
 */
public class NavigationNode extends Metadata {

    public transient String fileName;

    public List<NavigationNode> children = new ArrayList<NavigationNode>();

    public NavigationNode() {
    }

    public NavigationNode(TaxonomyPage taxonomyPage) {
        super(taxonomyPage, taxonomyPage.index);
    }
}

