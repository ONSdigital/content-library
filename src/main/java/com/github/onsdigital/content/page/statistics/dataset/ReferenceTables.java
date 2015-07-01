package com.github.onsdigital.content.page.statistics.dataset;

import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.statistics.base.Statistics;

/**
 * Created by bren on 01/07/15.
 */
public class ReferenceTables extends Statistics<DatasetDescription> {
    @Override
    public PageType getType() {
        return PageType.reference_tables;
    }
}
