package com.github.onsdigital.content.page.statistics;

import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.statistics.base.Statistics;
import com.github.onsdigital.content.partial.DownloadSection;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Dataset extends Statistics {

    //TODO: Currently using mostly the same fields as Alpha. Workout complex data pages

    /*Metadata*/
    public String datasetId;

    /*Body*/
    public List<DownloadSection> downloads = new ArrayList<DownloadSection>();
    public List<MarkdownSection> notes;

    public String description;


    @Override
    public PageType getType() {
        return PageType.dataset;
    }

}
