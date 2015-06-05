package com.github.onsdigital.content.taxonomy.statistic;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.DownloadSection;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.taxonomy.home.ProductPage;
import com.github.onsdigital.content.taxonomy.statistic.base.Statistic;

import java.net.URI;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Dataset extends Statistic {

    //TODO: Currently using mostly the same fields as Alpha. Workout complex data pages

    /*Metadata*/
    public String datasetId;

    /*Body*/
    public List<DownloadSection> downloads;
    public List<MarkdownSection> notes;

    public String description;


    public Dataset(String datasetId, String name, URI uri, String summary, ProductPage productPage) {
        super(name, uri, summary, ContentType.dataset, productPage);
        this.datasetId = datasetId;
    }

    private Dataset() {

    }
}
