package com.softserve.edu.hw4;

public class Name_address {
    public static void main(String[] args) {
        Just_scanner myScan = new Just_scanner();
        String name;
        myScan.requestinputData("What is your name?");
        name = myScan.inputData();
        String address;
        myScan.requestinputData(name + "! Where are you living now?");
        address = myScan.inputData();
        System.out.println(name + " is living in " + address);
        //System.out.println(Math.PI);
    }
}