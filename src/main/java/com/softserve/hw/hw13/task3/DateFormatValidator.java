package com.softserve.hw.hw13.task3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormatValidator implements DateValidator{

    private String dateFormat;

    public DateFormatValidator(String dateFormat){
        this.dateFormat = dateFormat;
        System.out.println("date format have to be like that:" + this.dateFormat);
    }

    @Override
    public boolean isValid(String dateStr) {
        DateFormat sdf = new SimpleDateFormat(this.dateFormat);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
            System.out.println(dateStr + " has correct format");
        } catch (ParseException e) {
            System.out.println(dateStr + " has incorrect format");
            return false;
        }
        return true;
    }
}
