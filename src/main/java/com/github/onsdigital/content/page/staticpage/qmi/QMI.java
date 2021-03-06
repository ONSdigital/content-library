package com.github.onsdigital.content.page.staticpage.qmi;

import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.staticpage.base.BaseStaticPage;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;

import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class QMI extends BaseStaticPage {

    private List<PageReference> relatedDatasets;
    private List<PageReference> relatedDocuments;

    @Override
    public PageType getType() {
        return PageType.static_qmi;
    }

    public List<PageReference> getRelatedDatasets() {
        return relatedDatasets;
    }

    public void setRelatedDatasets(List<PageReference> relatedDatasets) {
        this.relatedDatasets = relatedDatasets;
    }

    public List<PageReference> getRelatedDocuments() {
        return relatedDocuments;
    }

    public void setRelatedDocuments(List<PageReference> relatedDocuments) {
        this.relatedDocuments = relatedDocuments;
    }


    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        ContentUtil.loadReferencedPageDescription(contentService, relatedDatasets);
        ContentUtil.loadReferencedPageDescription(contentService, relatedDocuments);
    }
}
