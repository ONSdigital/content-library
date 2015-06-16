package com.github.onsdigital.content.partial.navigation;

import com.github.onsdigital.content.base.Content;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 10/06/15.
 */
public class Navigation extends Content {
    private List<NavigationNode> nodes = new ArrayList<>();

    public List<NavigationNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<NavigationNode> nodes) {
        this.nodes = nodes;
    }
}
