package com.github.onsdigital.content.page.release;

import com.github.onsdigital.content.page.base.PageType;
import com.github.onsdigital.content.page.statistics.document.base.StatisticalDocument;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;

import java.util.List;

/**
 * Created by bren on 04/06/15.
 */
public class Release extends StatisticalDocument {

    private MarkdownSection preRelease;

    private List<ReleaseDateChange> dateChanges;



    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
    }

    @Override
    public PageType getType() {
        return PageType.release;
    }

    public List<ReleaseDateChange> getDateChanges() {
        return dateChanges;
    }

    public void setDateChanges(List<ReleaseDateChange> dateChanges) {
        this.dateChanges = dateChanges;
    }

    public MarkdownSection getPreRelease() {
        return preRelease;
    }

    public void setPreRelease(MarkdownSection preRelease) {
        this.preRelease = preRelease;
    }
}
