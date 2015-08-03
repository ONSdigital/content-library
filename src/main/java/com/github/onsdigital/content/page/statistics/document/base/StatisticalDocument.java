package com.github.onsdigital.content.page.statistics.document.base;

import com.github.onsdigital.content.DirectoryListing;
import com.github.onsdigital.content.link.PageReference;
import com.github.onsdigital.content.page.statistics.base.Statistics;
import com.github.onsdigital.content.partial.FigureSection;
import com.github.onsdigital.content.partial.markdown.MarkdownSection;
import com.github.onsdigital.content.service.ContentNotFoundException;
import com.github.onsdigital.content.service.ContentRenderingService;
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

        boolean isLatestRelease = false;
        URI uri = this.getUri();
        URI parent = uri.getPath().endsWith("/") ? uri.resolve("..") : uri.resolve(".");
        String path = StringUtils.removeStart(parent.toString(), "/");
        DirectoryListing listing = contentService.readDirectory(path);

        this.setPreviousReleasesUri(parent.resolve("previousreleases"));
        this.setLatestReleaseUri(parent.resolve("latest"));

        if (listing.folders.isEmpty()) { isLatestRelease = true; }

        List<String> folders = new ArrayList<>(listing.folders.keySet());
        Collections.sort(folders, Collections.reverseOrder());
        String release = new File(uri.getPath()).getName();

        if (release.equals(folders.get(0))) {
            isLatestRelease = true;
        }

        this.getDescription().setLatestRelease(isLatestRelease);
    }

    @Override
    public void processContent(ContentService contentService, ContentRenderingService contentRenderingService) throws IOException {
        super.processContent(contentService, contentRenderingService);

        for (MarkdownSection markdownSection : this.getSections()) {
            processMarkdownSection(contentRenderingService, markdownSection);
        }

        for (MarkdownSection markdownSection : this.getAccordion()) {
            processMarkdownSection(contentRenderingService, markdownSection);
        }
    }

    private void processMarkdownSection(ContentRenderingService contentRenderingService, MarkdownSection markdownSection) throws IOException {
        String markdown = markdownSection.getMarkdown();
        markdown = new TableTagReplacer().replaceCustomTags(markdown, contentRenderingService);
        markdown = new ChartTagReplacer().replaceCustomTags(markdown, contentRenderingService);
        markdownSection.setMarkdown(markdown);
    }
}
