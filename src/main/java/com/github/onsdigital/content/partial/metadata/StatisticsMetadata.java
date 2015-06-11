package com.github.onsdigital.content.partial.metadata;

import com.github.onsdigital.content.page.statistics.base.Statistics;

import java.util.Date;

/**
 * Created by bren on 08/06/15.
 */
public class StatisticsMetadata extends Metadata {

    public Date releaseDate;

    public StatisticsMetadata() {

    }

    public StatisticsMetadata(Statistics statistics) {
        super(statistics);
        this.releaseDate = statistics.releaseDate;
    }

}
