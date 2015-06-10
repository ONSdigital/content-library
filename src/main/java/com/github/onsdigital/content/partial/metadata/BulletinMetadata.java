package com.github.onsdigital.content.partial.metadata;

import com.github.onsdigital.content.page.statistics.document.Bulletin;

/**
 * Created by bren on 05/06/15.
 *
 * Bulletin Reference has additional headlines
 *
 * See {@link Metadata}'s javadoc for the purpose of reference objects
 *
 */
public class BulletinMetadata extends Metadata {

    public String headline1;
    public String headline2;
    public String headline3;

    public BulletinMetadata(Bulletin bulletin) {
        super(bulletin);
        this.headline1 = bulletin.headline1;
        this.headline2 = bulletin.headline2;
        this.headline3 = bulletin.headline3;
    }
}
