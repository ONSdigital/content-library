package com.github.onsdigital.content.page.staticpage.foi;

import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.staticpage.base.BaseStaticPage;

/**
 * Created by bren on 04/06/15.
 */
public class FOI extends BaseStaticPage<FOIDescription> {
    @Override
    public PageType getType() {
        return PageType.static_foi;
    }
}
