package com.github.onsdigital.content.page.staticpage;

import com.github.onsdigital.content.page.base.PageDescription;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.staticpage.base.BaseStaticPage;

/**
 * Created by bren on 30/06/15.
 *
 * Simple static page with only markdown content
 */
public class StaticPage extends BaseStaticPage {
    @Override
    public PageType getType() {
        return PageType.static_page;
    }
}
