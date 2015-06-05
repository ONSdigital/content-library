package com.github.onsdigital.content.base;

import com.github.onsdigital.content.partial.link.ContentLink;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 * <p>
 * This is the generic content object that that has minimal fields required for every content type on the website and is used as a base for all.
 * <p>
 * Content on the website forms a logical hierarchy with homepage being the root of this hierarchy.
 * The hierarchy is shown as a breadcrumb on every page.
 *
 */
public abstract class Content {

    private ContentType type;

    //Metadata files refers to this field as "title" , although for compatibility with alpha it is kept as "name"
    public String name;

    public URI uri;

    //Not all content types has a summary.
    //Though there is not an immediate common generic type for each content type with summary. Hence summary is here in generic content object
    //Since gson library will not serialise null data into json file, summary won't appear in content types with no summary
    public String summary;

    public List<ContentLink> breadCrumb;

    /**
     * Public constructor to enforce necessary information to be passed into object.
     * Which in turn should eliminate coding errors involving not setting required information at development time.
     * <p>
     * serialize/deserialize utils on the other hand uses hidden constructors (via Reflection)
     * <p>
     * Objects should still be asserted for missing information after Deserializing
     *
     * @param name
     * @param uri
     * @param parent
     */
    public Content(String name, URI uri, ContentType type, Content parent) {
        this.name = name;
        this.uri = uri;
        this.type = type;
        buildBreadcrumb(parent);
    }

    /* Internal logic, not subject to serialise/deserialize operation*/


    private void buildBreadcrumb(Content parent) {
        breadCrumb = new ArrayList<ContentLink>();
        breadCrumb.addAll(parent.breadCrumb);
        //parent content is null for home page
        if (parent != null) {
            breadCrumb.add(new ContentLink(parent));
        }
    }

}
