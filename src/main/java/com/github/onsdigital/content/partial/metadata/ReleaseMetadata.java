package com.github.onsdigital.content.partial.metadata;

import com.github.onsdigital.content.page.release.Release;

import java.util.Date;

/**
 * Created by bren on 08/06/15.
 */
public class ReleaseMetadata extends Metadata {

    public Date releaseDate;
    public Date nextReleaseDate;

    public ReleaseMetadata(Release content) {
        super(content);
        this.releaseDate = content.releaseDate;
        this.nextReleaseDate = content.nextReleaseDate;
    }
}
