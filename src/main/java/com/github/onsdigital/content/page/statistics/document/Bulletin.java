package com.github.onsdigital.content.page.statistics.document;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.partial.metadata.BulletinMetadata;
import com.github.onsdigital.content.page.statistics.document.base.StatisticalDocument;

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

    public List<PageReference> relatedBulletins = new ArrayList<>();

    /*Migration fields*/
    public String phone;
    public String language;
    public String[] searchKeywords;

    @Override
    public PageType getType() {
        return PageType.bulletin;
    }

}
