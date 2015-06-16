package com.github.onsdigital.content.page.statistics.data.base;

import com.github.onsdigital.content.page.statistics.base.StatisticsDescription;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by bren on 16/06/15.
 */
public class StatisticalDataDescription extends StatisticsDescription {

    private String cdid;
    // We provide a minimal default for the unit, otherwise highcharts shows
    // "undefined":
    private String unit = "";
    private String preUnit = "";
    //TODO: Read this piece of info from metadata
    private String source = "Office for National Statistics"; // Where a statistic comes from. Typically "Office for National Statistics"

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
}
