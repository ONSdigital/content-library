package com.github.onsdigital.content.page.list;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;

public class ListPage extends Page {

    private String h2;
    private String frequency = "Monthly";

    @Override
    public PageType getType() {
        return PageType.list_page;
    }
}
