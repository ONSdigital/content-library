package com.github.onsdigital.content.base;

import com.github.onsdigital.content.partial.link.ContentLink;
import com.github.onsdigital.content.partial.reference.ContentReference;
import com.github.onsdigital.content.serialiser.ContentSerialiser;

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
 */
public abstract class Content {

    private ContentType type;

    public String title;

    public URI uri;

    //Not all content types has a summary.
    //Though there is not an immediate common generic type for each content type with summary. Hence summary is here in generic content object
    //Since gson library will not serialise null data into json file, summary won't appear in content types with no summary
    public String summary;

    public List<ContentReference> breadcrumb;

    public Content(ContentType type) {
        this.type = type;
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

    public void buildBreadcrumb(Content parent) {
        breadcrumb = new ArrayList<ContentReference>();
        //parent content is null for home page
        if (parent != null) {
            breadcrumb.addAll(parent.breadcrumb);
            breadcrumb.add(new ContentReference(parent));
        }
    }

    public ContentType getType() {
        return type;
    }
}
