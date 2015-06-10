package com.github.onsdigital.content.statistic.data;

import com.github.onsdigital.content.base.ContentType;
import com.github.onsdigital.content.partial.link.ContentLink;
import com.github.onsdigital.content.statistic.data.timeseries.TimeseriesValue;
import com.github.onsdigital.content.statistic.data.base.StatisticalData;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.*;
import java.util.regex.Pattern;

public class TimeSeries extends StatisticalData implements  Comparable<TimeSeries> {

    /*Metadata*/
    public String seasonalAdjustment;

    //Below fields appear on references to time series on other content types
    public String date;
    public String number;
    public String mainMeasure;

    /** This value is displayed in the "(i)" tooltips next to timeseries title. */
    public String keyNote;


    /*Body*/
    public List<ContentLink<TimeSeries>> relatedTimeseries = new ArrayList<>();
    /** This value is displayed beneath the timeseries title: */
    public String additionalText;




    /*Data*/

    // Regexes (what might the plural be?)
    public static Pattern year = Pattern.compile("\\d{4}");
    public static Pattern yearEnd = Pattern.compile("ye \\w{3} \\d{2}");
    public static Pattern yearInterval = Pattern.compile("\\d{4}-\\d{2,4}");
    public static Pattern yearPair = Pattern.compile("\\d{4}/\\d{2}");
    public static Pattern month = Pattern.compile("\\d{4} \\w{3}");
    public static Pattern quarter = Pattern.compile("\\d{4} \\w[1-4]");


    /**
     * The nectar, the goodness, the very juice of the fireflower: data.
     */
    public Set<TimeseriesValue> years = new TreeSet<>();
    public Set<TimeseriesValue> quarters = new TreeSet<>();
    public Set<TimeseriesValue> months = new TreeSet<>();

    /**
     * Enables the raw CSV values to be scaled to match the units defined here.
     * <p>
     * E.g. this might be 1000 to convert million-scale in the CSV to
     * billion-scale to match the scale of the headline figure and unit.
     * <p>
     * It's only needed during parsing, so we don't want it serialised to json:
     */
    private transient Double csvValueScaleFactor;

    /**
     * This field is here so that Rob can see which datasets have contributed
     * values. Please don't rely on it unless and until it has been designed
     * into the app with a genuine purpose.
     */
    public List<String> sourceDatasets = new ArrayList<String>();


    public void add(TimeseriesValue value) {

        try {

            // Get the date represented by this value:
            Calendar calendar = Calendar.getInstance(Locale.UK);
            calendar.setTime(value.toDate());

            // Populate the year. This is needed whether it's
            // yearly, quarterly or monthly:
            value.year = String.valueOf(calendar.get(Calendar.YEAR));

            // Set any other date components and
            // add it to the correct list:
            String key = StringUtils.lowerCase(StringUtils.trim(value.date));
            if (year.matcher(key).matches() || yearInterval.matcher(key).matches() || yearPair.matcher(key).matches()) {
                years.add(value);
            } else if (yearEnd.matcher(key).matches() || quarter.matcher(key).matches()) {
                // Months are zero based, which actually makes the quarter
                // calculation a bit easier:
                value.quarter = "Q" + ((calendar.get(Calendar.MONTH) / 3) + 1);
                quarters.add(value);
            } else if (month.matcher(key).matches()) {
                value.month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.UK);
                months.add(value);
            } else {
                throw new ParseException("Unknown format: '" + value.date + "'", 0);
            }

        } catch (ParseException e) {
            throw new RuntimeException("Error parsing date " + value.date, e);
        }
    }


    public void setCdid(String cdid) {
        if (StringUtils.isBlank(cdid)) {
            throw new IllegalArgumentException("Blank CDID");
        }
        this.cdid = StringUtils.trim(cdid);

        // We don't have metadata for all of the datasets,so
        // this provides a basic fallback by setting the CDID as the title:
        if (StringUtils.isBlank(title)) {
            title = cdid;
        }
    }

    public void setScaleFactor(double multiply) {
        this.csvValueScaleFactor = multiply;
    }

    public double getScaleFactor() {
        if (this.csvValueScaleFactor == null) {
            return 1;
        }
        return this.csvValueScaleFactor.doubleValue();
    }

    @Override
    public String toString() {
        return cdid;
    }

    @Override
    public int hashCode() {
        if (cdid != null) {
            return cdid.toLowerCase().hashCode();
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!TimeSeries.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        return StringUtils.equalsIgnoreCase(((TimeSeries) obj).cdid, cdid);
    }

    @Override
    public int compareTo(TimeSeries o) {
        return this.cdid.compareTo(o.cdid);
    }


    @Override
    public ContentType getType() {
        return ContentType.timeseries;
    }

}
