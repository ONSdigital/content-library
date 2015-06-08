package com.github.onsdigital.content.statistic.document;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.reference.BulletinReference;
import com.github.onsdigital.content.taxonomy.ProductPage;
import com.github.onsdigital.content.statistic.document.base.StatisticalDocument;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Bulletin extends StatisticalDocument {

    /*Metadata*/
    public String[] headlines = new String[3];

    public List<BulletinReference> relatedBulletins = new ArrayList<>();

    /*Migration fields*/
    public String phone;
    public String language;
    public String[] searchKeywords;


    public Bulletin(String name, URI uri, String summary, ProductPage productPage) {
        super(name, uri, summary, ContentType.bulletin, productPage);
    }

    private Bulletin() {

    }
}