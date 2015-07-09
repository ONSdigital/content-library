package com.github.onsdigital.content.service;

import com.github.onsdigital.content.DirectoryListing;

import java.io.InputStream;

/**
 * Created by bren on 10/06/15.
 */
public interface ContentService {

    InputStream readData(String uri) throws ContentNotFoundException;

    DirectoryListing readDirectory(String path) throws ContentNotFoundException;

    InputStream readPage(String uri) throws ContentNotFoundException;
}
