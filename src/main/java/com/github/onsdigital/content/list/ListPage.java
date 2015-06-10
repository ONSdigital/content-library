package com.github.onsdigital.content.list;

import com.github.onsdigital.content.base.Content;
import com.github.onsdigital.content.base.ContentType;

public class ListPage extends Content {

    public String h2;
    public String frequency = "Monthly";


    @Override
    public ContentType getType() {
        return ContentType.list_page;
    }
}
