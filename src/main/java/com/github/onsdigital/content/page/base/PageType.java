package com.github.onsdigital.content.page.base;

/**
 * Enumerates the different types of pages on the website.
 * <p>
 * Strictly these would be uppercase, but "shouty caps" looks wrong when
 * serialised to Json. There are ways around it, but the simplest solution is to
 * use lowercase - it's not worth the complexity.
 *
 * @author david
 * @author bren
 */
public enum PageType {

    home_page,
    taxonomy_landing_page,
    product_page,
    bulletin,
    article,
    timeseries,
    data_slice,
    compendium_landing_page,
    compendium,
    static_landing_page,
    static_article, //With table of contents
    static_page, //Pure markdown
    static_qmi,
    static_foi,
    static_adhoc,
    dataset,
    release,
    release_calendar,
    list_page, //???
    chart,
    table,
    unknown; //TODO:To be changed with complex pages. Keeping in for alpha content temporarily

    //TODO: Add all content types
}
