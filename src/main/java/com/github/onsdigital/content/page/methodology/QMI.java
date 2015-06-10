package com.github.onsdigital.content.page.methodology;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.partial.Contact;

import java.util.Date;

/**
 * Created by bren on 04/06/15.
 */
public class QMI extends Page {
    public Contact contact;
    public String surveyName;
    public String frequency;
    public String compilation;
    public String geographicCoverage;
    public int sampleSize;
    public Date lastRevised;

    @Override
    public PageType getType() {
        return PageType.qmi;
    }
}
