package com.github.onsdigital.content.page.staticpage.qmi;

import com.github.onsdigital.content.link.Link;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.staticpage.base.BaseStaticPage;
import com.github.onsdigital.content.partial.DownloadSection;

import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class QMI extends BaseStaticPage<QMIDescription> {
    @Override
    public PageType getType() {
        return PageType.static_qmi;
    }
}
