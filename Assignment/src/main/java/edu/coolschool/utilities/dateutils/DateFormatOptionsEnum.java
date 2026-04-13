package edu.coolschool.utilities.dateutils;
// this file is fine
public enum DateFormatOptionsEnum {
    DD_MM_YYYY("DD/MM/YYYY"),
    MM_DD_YYYY("MM/DD/YYYY"),
    YYYY_MM_DD("YYYY/MM/DD"),
    MONTH_DD_YYYY("Month DD, YYYY");

    private final String format;

    DateFormatOptionsEnum(String format) {
        this.format = format;
    }

}
