package com.github.onsdigital.content.partial;

import com.github.onsdigital.content.base.Content;

import java.util.List;

/**
 * Represents a section in a dataset for downloading
 */

//TODO: Get rid of old Alpha sections (Almost time to think about resources ( pdf,csv etc ).)
public class DownloadSection extends Content {
    public String title;
    public List<String> cdids;
    public String xls;
    public String csv;
}
