package com.github.onsdigital.content.page.statistics.data.timeseries;

import com.github.onsdigital.content.page.statistics.data.base.StatisticalDataDescription;

/**
 * Created by bren on 16/06/15.
 */
public class TimeseriesDescription extends StatisticalDataDescription {

    private String seasonalAdjustment;

    //Below fields appear on references to time series on other content types
    private String date;
    private String number;
    private String mainMeasure;

    /** This value is displayed in the "(i)" tooltips next to timeseries title. */
    private String keyNote;


    /*Body*/
//    public List<PageDescription> relatedTimeseries = new ArrayList<>();


    /** This value is displayed beneath the timeseries title: */
    private String additionalText;


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
}
