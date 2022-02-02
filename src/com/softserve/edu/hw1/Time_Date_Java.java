package com.softserve.edu.hw1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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

        //попрацюємо з форматами
        LocalDateTime LocDateTime = LocalDateTime.now();
        DateTimeFormatter usualform = DateTimeFormatter.ofPattern("dd MMMM(MMM | MM | M) yyyy HH:mm:ss");
        String afterFormat = LocDateTime.format(usualform);
        System.out.println(afterFormat);

        DateTimeFormatter whichDayOfYear = DateTimeFormatter.ofPattern("D");
        String wdoy = LocDateTime.format(whichDayOfYear);
        System.out.println("День року - " + wdoy);
    }
}
