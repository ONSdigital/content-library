package com.github.onsdigital.content.page.staticpage;

import com.github.onsdigital.content.page.base.PageDescription;
import com.github.onsdigital.content.partial.Contact;

/**
 * Created by bren on 30/06/15.
 */
public class StaticArticleDescription extends PageDescription {
    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
