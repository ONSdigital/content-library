package com.github.onsdigital.content.partial.reference;

import com.github.onsdigital.content.statistic.document.Bulletin;

/**
 * Created by bren on 05/06/15.
 *
 * Bulletin Reference has additional headlines
 *
 * See {@link ContentReference}'s javadoc for the purpose of reference objects
 *
 */
public class BulletinReference extends ContentReference<Bulletin> {

    public String headline1;
    public String headline2;
    public String headline3;

    public BulletinReference(Bulletin bulletin) {
        super(bulletin);
        this.headline1 = bulletin.headline1;
        this.headline2 = bulletin.headline2;
        this.headline3 = bulletin.headline3;
    }
}
