package com.github.onsdigital.content.base;

import com.github.onsdigital.content.Unknown;
import com.github.onsdigital.content.aboutus.AboutUs;
import com.github.onsdigital.content.aboutus.AboutUsBrowsePage;
import com.github.onsdigital.content.aboutus.FOI;
import com.github.onsdigital.content.adhoc.AdHoc;
import com.github.onsdigital.content.home.HomePage;
import com.github.onsdigital.content.list.ListPage;
import com.github.onsdigital.content.methodology.Methodology;
import com.github.onsdigital.content.methodology.MethodologyLandingPage;
import com.github.onsdigital.content.methodology.QMI;
import com.github.onsdigital.content.release.Release;
import com.github.onsdigital.content.release.ReleaseCalendar;
import com.github.onsdigital.content.statistic.Compendium;
import com.github.onsdigital.content.statistic.Dataset;
import com.github.onsdigital.content.statistic.data.DataSlice;
import com.github.onsdigital.content.statistic.data.TimeSeries;
import com.github.onsdigital.content.statistic.document.Article;
import com.github.onsdigital.content.statistic.document.Bulletin;
import com.github.onsdigital.content.taxonomy.CompendiumLandingPage;
import com.github.onsdigital.content.taxonomy.ProductPage;
import com.github.onsdigital.content.taxonomy.TaxonomyLandingPage;

/**
 * Enumerates the different types of page on the website.
 * <p>
 * Strictly these would be uppercase, but "shouty caps" looks wrong when
 * serialised to Json. There are ways around it, but the simplest solution is to
 * use lowercase - it's not worth the complexity.
 *
 * @author david
 * @author bren
 */
public enum ContentType {

    home_page(HomePage.class),
    taxonomy_landing_page(TaxonomyLandingPage.class),
    product_page(ProductPage.class),
    bulletin(Bulletin.class),
    article(Article.class),
    timeseries(TimeSeries.class),
    data_slice(DataSlice.class),
    compendium_landing_page(CompendiumLandingPage.class),
    compendium(Compendium.class),
    methodology_landing_page(MethodologyLandingPage.class),
    methodology(Methodology.class),
    qmi(QMI.class),
    about_us_browse_page(AboutUsBrowsePage.class),
    about_us(AboutUs.class),
    foi(FOI.class),
    adhoc(AdHoc.class),
    dataset(Dataset.class),
    release(Release.class),
    release_calendar(ReleaseCalendar.class),
    list_page(ListPage.class), //???
    unknown(Unknown.class); //TODO:To be changed with complex pages. Keeping in for alpha content temporarily


    <T extends  Content> ContentType(Class<T> contentClass) {
        this._class = contentClass;
    }

    private transient Class _class;

    //TODO: Add all content types
}
