package com.github.onsdigital.content.service;

import java.io.IOException;

/**
 * Generic interface for rendering pages,
 */
public interface ContentRenderingService {

    String renderPage(String uri) throws IOException, ContentNotFoundException;

    String renderChart(String uri, boolean partial) throws IOException, ContentNotFoundException;

    String renderTable(String uri, boolean partial) throws IOException, ContentNotFoundException;
}
