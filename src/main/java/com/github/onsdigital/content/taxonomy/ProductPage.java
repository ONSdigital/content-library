package com.github.onsdigital.content.taxonomy;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.reference.BulletinReference;
import com.github.onsdigital.content.partial.reference.ContentReference;
import com.github.onsdigital.content.statistic.Dataset;
import com.github.onsdigital.content.statistic.data.base.StatisticalData;
import com.github.onsdigital.content.statistic.document.Article;
import com.github.onsdigital.content.statistic.document.Bulletin;
import com.github.onsdigital.content.taxonomy.base.TaxonomyPage;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class ProductPage extends TaxonomyPage {

    //Statistic headline, might either be a time series or data slice.
    public ContentReference<StatisticalData> headline;

    public ContentReference<Bulletin> statsBulletinHeadline;

    //Statistic items ( time series, data slices )
    public List<ContentReference<StatisticalData>> items;

    public List<ContentReference<Dataset>> datasets;

    public List<BulletinReference> statsBulletins = new ArrayList<>();

    public List<ContentReference<Article>> relatedArticles;


    /**
     * Public constructor enforces required information for setting up the hierarchy and location to be passed into objects.
     * Which in turn should eliminate coding errors involving missing information at development time.
     * <p>
     * serialize/deserialize utils on the other hand should use private constructors (via Reflection)
     * <p>
     * Objects should still be asserted for missing information after Deserializing
     *
     * @param name   Name/Title of this content
     * @param uri    Uri of the content
     * @param parent Content which will appear as parent of this content on breadcrumb
     *
     */

    public ProductPage(String name, URI uri, String summary, TaxonomyLandingPage parent) {
        super(name, uri, ContentType.product_page, parent);
        this.summary = summary;
    }

    private ProductPage() {
    }

}
