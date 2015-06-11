package com.github.onsdigital.content.service;

/**
 * Created by bren on 10/06/15.
 */
public interface ContentService {
    String getDataAsString(String uri) throws ContentNotFoundException;
}
