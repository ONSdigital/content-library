package com.github.onsdigital.content.page.statistics.data;

import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.statistics.Dataset;
import com.github.onsdigital.content.page.statistics.data.base.StatisticalData;

import java.util.List;

/**
 * Created by bren on 05/06/15.
 */
public class DataSlice extends StatisticalData {

    /*Metadata*/


    /*Body*/
    public List<PageReference> relatedDatasets;


    @Override
    public PageType getType() {
        return PageType.data_slice;
    }

}
