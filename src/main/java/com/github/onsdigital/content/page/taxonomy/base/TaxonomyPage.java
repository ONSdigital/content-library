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
public abstract class TaxonomyPage extends Page implements Comparable<TaxonomyPage>  {

    private Integer index;

    @Override
    public int compareTo(TaxonomyPage o) {
        if (this.index == null) {
            return -1;
        }
        return Integer.compare(this.index, o.index);
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
