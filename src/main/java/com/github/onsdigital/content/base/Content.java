package com.github.onsdigital.content.base;

import com.github.onsdigital.content.partial.link.ContentLink;
import com.github.onsdigital.content.serialiser.ContentSerialiser;

import java.net.URI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

    public String title;

    public URI uri;

    //Not all content types has a summary.
    //Though there is not an immediate common generic type for each content type with summary. Hence summary is here in generic content object
    //Since gson library will not serialise null data into json file, summary won't appear in content types with no summary
    public String summary;

    public List<ContentLink> breadCrumb;

    /**
     * Public constructor enforces required information for setting up the hierarchy and location to be passed into objects.
     * Which in turn should eliminate coding errors involving missing information at development time.
     * <p>
     * serialize/deserialize utils on the other hand should use private constructors (via Reflection)
     * <p>
     * Objects should still be asserted for missing information after Deserializing
     *
     * @param name Name/Title of this content
     * @param uri Uri of the content
     * @param parent Parent content which gives access to this content, should be null for homepage
     */
    public Content(String name, URI uri, ContentType type, Content parent) {
        this.title = name;
        this.uri = uri;
        this.type = type;
        buildBreadcrumb(parent);
    }

    protected Content() {

    }


    /**
     * Serialises object into json document as String.
     *
     * @return json
     */
    public String toJson() {
        return new ContentSerialiser().serialise(this);
    }


    /**
     * Serialises object into json document as String. Formats date fields with given date pattern
     *
     * @param datePattern
     * @return json
     */
    public String toJson(String datePattern) {
        return new ContentSerialiser(datePattern).serialise(this);
    }

    private void buildBreadcrumb(Content parent) {
        breadCrumb = new ArrayList<ContentLink>();
        breadCrumb.addAll(parent.breadCrumb);
        //parent content is null for home page
        if (parent != null) {
            breadCrumb.add(new ContentLink(parent));
        }
    }

}
