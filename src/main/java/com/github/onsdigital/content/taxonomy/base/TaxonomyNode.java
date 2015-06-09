package com.github.onsdigital.content.taxonomy.base;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Represents a node on taxonomy
 *
 * @author david
 * @author bren
 */
public abstract class TaxonomyNode extends Content implements  Comparable<TaxonomyNode>  {

    public transient Integer index;

    public TaxonomyNode(ContentType contentType) {
        this(null, contentType);
    }

    public TaxonomyNode(Integer index, ContentType contentType) {
        super(contentType);
        this.index = index;
    }


    @Override
    public int compareTo(TaxonomyNode o) {
        return Integer.compare(this.index, o.index);
    }

}
