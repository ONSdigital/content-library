package com.github.onsdigital.content.partial.reference;

import com.github.onsdigital.content.release.Release;

import java.util.Date;

/**
 * Created by bren on 08/06/15.
 */
public class ReleaseReference extends  ContentReference<Release> {

    public Date releaseDate;
    public Date nextReleaseDate;

    public ReleaseReference(Release content) {
        super(content);
        this.releaseDate = content.releaseDate;
        this.nextReleaseDate = content.nextReleaseDate;
    }
}
