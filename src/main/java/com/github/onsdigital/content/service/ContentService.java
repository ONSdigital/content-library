package com.github.onsdigital.content.service;

import java.io.InputStream;
import java.net.URI;

/**
 * Created by bren on 10/06/15.
 */
public interface ContentService {
    InputStream getDataAsString(String uri);
}
