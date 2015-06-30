package com.github.onsdigital.content.page.adhoc;

import com.github.onsdigital.content.page.base.Page;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.staticpage.base.BaseStaticPage;

import java.util.Date;

/**
 * Created by bren on 04/06/15.
 */
public class AdHoc extends BaseStaticPage<AdHocDescription> {

    @Override
    public PageType getType() {
        return PageType.static_adhoc;
    }

}
