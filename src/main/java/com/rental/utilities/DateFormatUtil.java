package com.rental.utilities;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateFormatUtil {
    public static final String DATE_FORMAT = "dd-MM-yyyy";
    public static final String BLANK_STRING = "";

    public static String formatDateToString(Date date){
        if(date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
            return dateFormat.format(date);
        }
        return BLANK_STRING;
    }
}
