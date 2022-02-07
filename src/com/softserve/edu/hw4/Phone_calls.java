package com.softserve.edu.hw4;

import java.text.DecimalFormat;

public class Phone_calls {
    public static void main(String[] args) {
        Just_scanner myScan = new Just_scanner();
        String[] call = {"call1", "call2", "call3"};
        int[] durationC = {0, 0, 0};
        int total_duration = 0;
        float[] rate_call = {0, 0, 0};
        float total_coast = 0;
        int iter = 0;
        for (String i : call) {
            myScan.requestinputData("Enter " + i +" duration (in minutes):");
            durationC[iter] = (myScan.inputData(0));
            myScan.requestinputData("Enter rate for " + i + " (USD):");
            rate_call[iter] = (myScan.inputData(0.0f));
            total_duration = total_duration + durationC[iter];
            total_coast = total_coast + (rate_call[iter]*durationC[iter++]);
        }
        iter = 0;
        for(float i : rate_call) {
            System.out.println("Total cost " + call[iter] + " = " +durationC[iter] * rate_call[iter++]);
        }
        System.out.println("Total duration " + total_duration + " minutes");
        System.out.println("Total coast " + total_coast);
    }
}
