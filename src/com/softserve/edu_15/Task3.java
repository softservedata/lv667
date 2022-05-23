package com.softserve.edu_15;

import java.time.LocalDate;

/*
Create method to validate date according to format "mm.dd.yy"
 */
public class Task3 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        String time = currentDate.toString();
        System.out.println(time);
        String [] arr = time.split("-");
        System.out.println(arr[1] + "-" + arr[2] + "-" + arr[0]);
    }
}