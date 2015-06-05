package com.github.onsdigital.content.partial.reference;

import com.github.onsdigital.content.taxonomy.statistic.Bulletin;

/**
 * Created by bren on 05/06/15.
 *
 * Bulletin Reference has additional headlines
 *
 * See {@link ContentReference}'s javadoc for the purpose of reference objects
 *
 */
public class BulletinReference extends ContentReference<Bulletin> {

    public String[] headlines;

    public BulletinReference(Bulletin bulletin) {
        super(bulletin);
        this.headlines = bulletin.headlines;
    }
}
