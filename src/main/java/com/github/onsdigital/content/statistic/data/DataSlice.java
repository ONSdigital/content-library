package com.github.onsdigital.content.statistic.data;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.link.ContentLink;
import com.github.onsdigital.content.statistic.Dataset;
import com.github.onsdigital.content.statistic.data.base.StatisticalData;

import java.util.List;

/**
 * Created by bren on 05/06/15.
 */
public class DataSlice extends StatisticalData {

    /*Metadata*/


    /*Body*/
    public List<ContentLink<Dataset>> relatedDatasets;


    @Override
    public ContentType getType() {
        return ContentType.data_slice;
    }

}
