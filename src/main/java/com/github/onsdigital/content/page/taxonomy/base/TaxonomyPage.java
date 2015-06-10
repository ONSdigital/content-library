package com.github.onsdigital.content.page.taxonomy.base;

import com.github.onsdigital.content.page.base.Page;

/**
 * Created by bren on 04/06/15.
 * <p>
 * Represents a taxonomy page
 *
 * @author david
 * @author bren
 */
public abstract class TaxonomyPage extends Page implements  Comparable<TaxonomyPage>  {

    public Integer index;

    @Override
    public int compareTo(TaxonomyPage o) {
        return Integer.compare(this.index, o.index);
    }

}
