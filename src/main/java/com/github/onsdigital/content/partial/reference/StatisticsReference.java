package com.github.onsdigital.content.partial.reference;

import com.github.onsdigital.content.statistic.base.Statistics;

import java.util.Date;

/**
 * Created by bren on 08/06/15.
 */
public class StatisticsReference extends  ContentReference<Statistics>  {

    public Date releaseDate;

    public StatisticsReference(Statistics statistics) {
        super(statistics);
        this.releaseDate = statistics.releaseDate;
    }


}
