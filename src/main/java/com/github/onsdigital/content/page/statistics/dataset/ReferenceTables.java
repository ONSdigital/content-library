package com.github.onsdigital.content.page.statistics.dataset;

import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.statistics.base.Statistics;

/**
 * Created by bren on 01/07/15.
 */
public class ReferenceTables extends Dataset {

    private boolean migrated;

    @Override
    public PageType getType() {
        return PageType.reference_tables;
    }

    public boolean isMigrated() {
        return migrated;
    }

    public void setMigrated(boolean migrated) {
        this.migrated = migrated;
    }
}
