package com.softserve.edu.hw1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time_Date_Java {
    public static void main(String[] args) {
        LocalDate currentLocalDateStr = LocalDate.now();
        //yyyy-mm-dd
        System.out.println(currentLocalDateStr);

        //time
        LocalTime currentLocalTimeStr = LocalTime.now();
        System.out.println(currentLocalTimeStr);

        //get only hour
        System.out.println(currentLocalTimeStr.getHour());

        //max-min local time
        LocalTime maxTimeStr = LocalTime.MAX;
        System.out.println(maxTimeStr);

        LocalTime minTimeStr = LocalTime.MIN;
        System.out.println(minTimeStr);

        //max-min local date
        LocalDate maxLD = LocalDate.MAX;
        System.out.println(maxLD);

        LocalDate minLD = LocalDate.MIN;
        System.out.println(minLD);
    }
}
