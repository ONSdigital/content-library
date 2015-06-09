package com.github.onsdigital.content.statistic.document;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.reference.BulletinReference;
import com.github.onsdigital.content.statistic.document.base.StatisticalDocument;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Bulletin extends StatisticalDocument {

    /*Metadata*/
    public String headline1;
    public String headline2;
    public String headline3;

    public List<BulletinReference> relatedBulletins = new ArrayList<>();

    /*Migration fields*/
    public String phone;
    public String language;
    public String[] searchKeywords;


    public Bulletin() {
        super(ContentType.bulletin);
    }
}
