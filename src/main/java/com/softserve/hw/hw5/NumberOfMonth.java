package com.softserve.hw.hw5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
 * TASK 1:
 * Ask user to enter the number of month.
 * Read the value and write the amount of days in this month (create array with amount days of each month).
 * */

public class NumberOfMonth {
    private HashMap<Integer,Integer> monthAndDys = new HashMap<Integer,Integer>();

    // Constructor
    public NumberOfMonth(){
        monthAndDys.put(1,31);
        monthAndDys.put(2,28);
        monthAndDys.put(3,31);
        monthAndDys.put(4,30);
        monthAndDys.put(5,31);
        monthAndDys.put(6,30);
        monthAndDys.put(7,31);
        monthAndDys.put(8,31);
        monthAndDys.put(9,30);
        monthAndDys.put(10,31);
        monthAndDys.put(11,30);
        monthAndDys.put(12,31);
    }

    public void getDysInMonth(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of month 1-12 :");
        try {
            int pos = Integer.parseInt(bf.readLine());
            if(pos>0 && pos <13){
                System.out.println("there are " + monthAndDys.get(pos) + " days in month with index = " + pos);
            }else{
                throw new Exception("month index out of range");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public HashMap<Integer, Integer> getMonthAndDys() {
        return monthAndDys;
    }
}
