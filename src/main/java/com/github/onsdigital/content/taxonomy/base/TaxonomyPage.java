package com.github.onsdigital.content.taxonomy.base;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.home.HomePage;
import com.github.onsdigital.content.taxonomy.TaxonomyLandingPage;

import java.net.URI;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Represents a taxonomy page.
 *
 * @author david
 * @author bren
 */
public class TaxonomyPage extends Content implements  Comparable<TaxonomyPage>  {

    public int index;

    /**
     * Public constructor enforces required information for setting up the hierarchy and location to be passed into objects.
     * Which in turn should eliminate coding errors involving missing information at development time.
     * <p>
     * serialize/deserialize utils on the other hand should use private constructors (via Reflection)
     * <p>
     * Objects should still be asserted for missing information after Deserializing
     *
     * @param name   Name/Title of this content
     * @param uri    Uri of the content
     * @param parent Content which will appear as parent of this content on breadcrumb
     */
    public TaxonomyPage(String name, URI uri, ContentType type, TaxonomyPage  parent) {
        super(name, uri, type, parent == null ? new HomePage() : parent);
    }

    public TaxonomyPage(String name, URI uri, ContentType type) {
        super(name, uri, type, new HomePage());
    }

    protected TaxonomyPage() {

    }


    @Override
    public int compareTo(TaxonomyPage o) {
        return Integer.compare(this.index, o.index);
    }

}
