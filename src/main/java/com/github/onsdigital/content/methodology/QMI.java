package com.github.onsdigital.content.methodology;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.Contact;

import java.util.Date;

/**
 * Created by bren on 04/06/15.
 */
public class QMI extends Content {
    public Contact contact;
    public String surveyName;
    public String frequency;
    public String compilation;
    public String geographicCoverage;
    public int sampleSize;
    public Date lastRevised;

    @Override
    public ContentType getType() {
        return ContentType.qmi;
    }
}
