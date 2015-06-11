package com.github.onsdigital.content.page.release;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.partial.Contact;
import com.github.onsdigital.content.partial.metadata.ReleaseMetadata;

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

    public List<ReleaseMetadata> articles = new ArrayList<>();
    public List<ReleaseMetadata> bulletins = new ArrayList<>();
    public List<ReleaseMetadata> datasets = new ArrayList<>();

    @Override
    public PageType getType() {
        return PageType.release;
    }

}
