package com.github.onsdigital.content.page.release;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.partial.Contact;
import com.github.onsdigital.content.partial.metadata.Metadata;
import com.github.onsdigital.content.page.statistics.Dataset;
import com.github.onsdigital.content.page.statistics.document.Article;
import com.github.onsdigital.content.page.statistics.document.Bulletin;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Release extends Page {

    /*Metadata*/
    public Contact contact;
    public Date releaseDate;
    public Date nextReleaseDate;
    public boolean nationalStatistics;


    public List<PageReference> articles = new ArrayList<>();
    public List<PageReference> bulletins = new ArrayList<>();
    public List<PageReference> datasets = new ArrayList<>();

    @Override
    public PageType getType() {
        return PageType.release;
    }

    @Override
    public void loadReferences(ContentService contentService) {
        super.loadReferences(contentService);
        ContentUtil.initializeMetadata(contentService, articles);
        ContentUtil.initializeMetadata(contentService, bulletins);
        ContentUtil.initializeMetadata(contentService, datasets);
    }
}
