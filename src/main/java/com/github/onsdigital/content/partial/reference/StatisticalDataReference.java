package com.github.onsdigital.content.partial.reference;

import com.github.onsdigital.content.taxonomy.statistic.data.TimeSeries;
import com.github.onsdigital.content.taxonomy.statistic.data.base.StatisticalData;

/**
 * Created by bren on 05/06/15.Statistical data reference has additional numbers and date fields that can be used on product pages
 *
 * In order to display a basic reference to a statistical data without any numbers and statistics use {@link ContentReference}
 * See {@link ContentReference}s
 */
public class StatisticalDataReference extends ContentReference<StatisticalData> {

    public StatisticalDataReference(StatisticalData data) {
        super(data);
    }
}
