package com.github.onsdigital.content.page.base;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.partial.navigation.Navigation;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 * <p>
 * This is the generic page object that that has minimal fields required for every page type on the website and is used as a base for all.
 * <p>
 * Page on the website forms a logical hierarchy with homepage being the root of this hierarchy.
 * The hierarchy is shown as a breadcrumb on every page.
 */
public abstract class Page extends Content {

    private PageType type;
    private URI uri;
    private List<PageReference> breadcrumb;

    private PageDescription description;

    //Every page on the website has navigation, but this is generated on runtime. No need to serialise it into json files
    private transient Navigation navigation;

    public Page() {
        this.type = getType();
    }

    public void buildBreadcrumb(Page parent) {
        breadcrumb = new ArrayList<>();
        //parent content is null for home page
        if (parent != null) {
            breadcrumb.addAll(parent.breadcrumb);
            breadcrumb.add(new PageReference(parent));
        }
    }

    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        ContentUtil.loadReferencedPages(contentService, breadcrumb);
    }

    public abstract PageType getType();

    public PageDescription getDescription() {
        return description;
    }

    protected void setDescription(PageDescription description) {
        this.description = description;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }
}
