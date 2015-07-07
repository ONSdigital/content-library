package com.github.onsdigital.content.page.base;

import com.github.onsdigital.content.base.ContentDescription;
import com.github.onsdigital.content.partial.Contact;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by bren on 04/06/15.
 * <p/>
 * A wrapper class that holds all possible description fields used in all page types.
 * Instead of creating a hierarchy of description object ( as it was done initially ),
 * we accumulate all description fields of all page in this folder to avoid serialising/deserialising pitfalls
 * <p/>
 */
public class PageDescription extends ContentDescription implements Comparable<PageDescription> {

    //Index is used for ordering if set
    private Integer index;
    private String title;
    //Below fields are not common for all page types. But there is no immediate generic type to put these fields in
    //These fields won't be serialised into json if empty
    private String summary;
    private List<String> keywords; //Used for search engines to read ?
    private String metaDescription;

    /*Statistics Description*/
    private boolean nationalStatistic;
    private Contact contact;
    private Date releaseDate;
    private String nextRelease;
    private String language;

    private String edition;
    private String _abstract;
    private List<String> authors;


    private String headline;//Used in compendium

    /*Bulletin headlines*/
    private String headline1;
    private String headline2;
    private String headline3;


    private String datasetId;


    /*Statistical Data description*/
    private String cdid;
    // We provide a minimal default for the unit, otherwise highcharts shows
    // "undefined":
    private String unit = "";
    private String preUnit = "";
    private String source = ""; // Where a statistic comes from. Typically "Office for National Statistics"


    private String seasonalAdjustment;

    //Below fields appear on references to time series on other content types
    private String date;
    private String number;
    private String mainMeasure;

    /** This value is displayed in the "(i)" tooltips next to timeseries title. */
    private String keyNote;

    /** This value is displayed beneath the timeseries title: */
    private String additionalText;


    /*QMI Description*/
    private String surveyName;
    private String frequency;
    private String compilation;
    private String geographicCoverage;
    private int sampleSize;
    private Date lastRevised;

    /*Adhoc content reference*/
    private String reference;




    /*Migration Data*/
    public transient String theme;
    public transient String level2;
    public transient String level3;


    public PageDescription() {
    }

    @Override
    public int compareTo(PageDescription o) {
        //nulls last or first
        if (this.index == null) {
            return -1;
        }
        return Integer.compare(this.index, o.index);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }


    public boolean isNationalStatistic() {
        return nationalStatistic;
    }

    public void setNationalStatistic(boolean nationalStatistic) {
        this.nationalStatistic = nationalStatistic;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getNextRelease() {
        return nextRelease;
    }

    public void setNextRelease(String nextRelease) {
        this.nextRelease = nextRelease;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String get_abstract() {
        return _abstract;
    }

    public void set_abstract(String _abstract) {
        this._abstract = _abstract;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getHeadline1() {
        return headline1;
    }

    public void setHeadline1(String headline1) {
        this.headline1 = headline1;
    }

    public String getHeadline2() {
        return headline2;
    }

    public void setHeadline2(String headline2) {
        this.headline2 = headline2;
    }

    public String getHeadline3() {
        return headline3;
    }

    public void setHeadline3(String headline3) {
        this.headline3 = headline3;
    }

    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public String getCdid() {
        return cdid;
    }

    public void setCdid(String cdid) {
        if (StringUtils.isBlank(cdid)) {
            throw new IllegalArgumentException("Blank CDID");
        }
        // We don't have metadata for all of the datasets,so
        // this provides a basic fallback by setting the CDID as the title:
        if (StringUtils.isBlank(getTitle())) {
            setTitle(cdid);
        }
        this.cdid = cdid;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPreUnit() {
        return preUnit;
    }

    public void setPreUnit(String preUnit) {
        this.preUnit = preUnit;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    public String getSeasonalAdjustment() {
        return seasonalAdjustment;
    }

    public void setSeasonalAdjustment(String seasonalAdjustment) {
        this.seasonalAdjustment = seasonalAdjustment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMainMeasure() {
        return mainMeasure;
    }

    public void setMainMeasure(String mainMeasure) {
        this.mainMeasure = mainMeasure;
    }

    public String getKeyNote() {
        return keyNote;
    }

    public void setKeyNote(String keyNote) {
        this.keyNote = keyNote;
    }

    public String getAdditionalText() {
        return additionalText;
    }

    public void setAdditionalText(String additionalText) {
        this.additionalText = additionalText;
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getCompilation() {
        return compilation;
    }

    public void setCompilation(String compilation) {
        this.compilation = compilation;
    }

    public String getGeographicCoverage() {
        return geographicCoverage;
    }

    public void setGeographicCoverage(String geographicCoverage) {
        this.geographicCoverage = geographicCoverage;
    }

    public int getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(int sampleSize) {
        this.sampleSize = sampleSize;
    }

    public Date getLastRevised() {
        return lastRevised;
    }

    public void setLastRevised(Date lastRevised) {
        this.lastRevised = lastRevised;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
