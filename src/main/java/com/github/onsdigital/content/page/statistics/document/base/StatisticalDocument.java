package com.github.onsdigital.content.page.statistics.document.base;

import com.github.onsdigital.content.DirectoryListing;
import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.statistics.base.Statistics;
import com.github.onsdigital.content.partial.FigureSection;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentService;
import com.github.onsdigital.content.util.ContentUtil;
import com.github.onsdigital.content.util.markdown.ChartTagReplacer;
import com.github.onsdigital.content.util.markdown.TableTagReplacer;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by bren on 06/06/15.
 */
public abstract class StatisticalDocument extends Statistics {

    private static TableTagReplacer tableTagReplacer = new TableTagReplacer();
    private static ChartTagReplacer chartTagReplacer = new ChartTagReplacer();

    /*Body*/
    private List<MarkdownSection> sections = new ArrayList<>();
    private List<MarkdownSection> accordion = new ArrayList<>();
    private List<PageReference> relatedData = new ArrayList<>();//Link to data in the article
    private List<FigureSection> charts = new ArrayList<>();
    private List<FigureSection> tables = new ArrayList<>();

    private URI latestReleaseUri;
    private URI previousReleasesUri;

    @Override
    public void loadReferences(ContentService contentService) throws ContentNotFoundException {
        super.loadReferences(contentService);
        ContentUtil.loadReferencedPageDescription(contentService, relatedData);
        populate(contentService);
    }

    public URI getLatestReleaseUri() { return latestReleaseUri; }

    public void setLatestReleaseUri(URI latestReleaseUri) { this.latestReleaseUri = latestReleaseUri; }

    public URI getPreviousReleasesUri() { return previousReleasesUri; }

    public void setPreviousReleasesUri(URI previousReleasesUri) { this.previousReleasesUri = previousReleasesUri; }

    public List<MarkdownSection> getSections() {
        return sections;
    }

    public void setSections(List<MarkdownSection> sections) {
        this.sections = sections;
    }

    public List<MarkdownSection> getAccordion() {
        return accordion;
    }

    public void setAccordion(List<MarkdownSection> accordion) {
        this.accordion = accordion;
    }

    public List<PageReference> getRelatedData() {
        return relatedData;
    }

    public void setRelatedData(List<PageReference> relatedData) {
        this.relatedData = relatedData;
    }

    public List<FigureSection> getCharts() { return charts; }

    public void setCharts(List<FigureSection> charts) { this.charts = charts; }

    public List<FigureSection> getTables() { return tables; }

    public void setTables(List<FigureSection> tables) { this.tables = tables; }

    private void populate(ContentService contentService) throws ContentNotFoundException {

        URI uri = this.getUri();
        URI parent = uri.getPath().endsWith("/") ? uri.resolve("..") : uri.resolve(".");

        this.setPreviousReleasesUri(parent.resolve("previousreleases"));
        this.setLatestReleaseUri(parent.resolve("latest"));

        boolean isLatestRelease = isLatestRelease(contentService, uri, parent);
        this.getDescription().setLatestRelease(isLatestRelease);

        ReplaceCustomMarkdownTags(contentService);
    }

    private void ReplaceCustomMarkdownTags(ContentService contentService) {
        for (MarkdownSection section : sections) {
            String markdown = section.getMarkdown();
            try {

                markdown = tableTagReplacer.replaceAll(markdown, contentService);
                markdown = chartTagReplacer.replaceAll(markdown, contentService);
            } catch (IOException e) {
                e.printStackTrace();
            }
            section.setMarkdown(markdown);
        }
    }

    private boolean isLatestRelease(ContentService contentService, URI uri, URI parent) throws ContentNotFoundException {
        boolean isLatestRelease = false;
        String path = StringUtils.removeStart(parent.toString(), "/");
        DirectoryListing listing = contentService.readDirectory(path);
        if (listing.folders.isEmpty()) { isLatestRelease = true; }

        List<String> folders = new ArrayList<>(listing.folders.keySet());
        Collections.sort(folders, Collections.reverseOrder());
        String release = new File(uri.getPath()).getName();

        if (release.equals(folders.get(0))) {
            isLatestRelease = true;
        }
        return isLatestRelease;
    }
}
