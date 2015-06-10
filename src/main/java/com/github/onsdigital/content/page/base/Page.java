package com.github.onsdigital.content.page.base;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.partial.metadata.Metadata;
import com.github.onsdigital.content.partial.navigation.Navigation;
import com.github.onsdigital.content.service.ContentService;

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
public abstract class Page extends Content implements Cloneable {

    private PageType type;

    public String title;

    public URI uri;

    //Navigation should not be persisted into file system, it is generated on the fly
    public Navigation navigation;

    //Not all content types has a summary.
    //Though there is not an immediate common generic type for each content type with summary. Hence summary is here in generic content object
    //Since gson library will not serialise null data into json file, summary won't appear in content types with no summary
    public String summary;

    public List<Metadata> breadcrumb;

    public Page() {
        this.type = getType();
    }

    public void buildBreadcrumb(Page parent) {
        breadcrumb = new ArrayList<Metadata>();
        //parent content is null for home page
        if (parent != null) {
            breadcrumb.addAll(parent.breadcrumb);
            breadcrumb.add(new Metadata(parent));
        }
    }

    public abstract PageType getType();
}
