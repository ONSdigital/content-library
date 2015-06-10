package com.github.onsdigital.content.statistic;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.DownloadSection;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.statistic.base.Statistics;

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
    public ContentType getType() {
        return ContentType.dataset;
    }

}
