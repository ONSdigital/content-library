package com.github.onsdigital.content.page.error;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;

/**
 * Created by bren on 08/07/15.
 */
public class Error404 extends Page {
    @Override
    public PageType getType() {
        return PageType.error404;
    }
}
