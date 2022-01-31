package com.softserve.edu.hw1;

public class Data_Types_xmpl {
    public static void main(String[] args) {
        char currentVar = 64;
        System.out.println((int) currentVar+" це "+currentVar);
        //char currentVar = 0;
        currentVar = 0;
        int i=0;
        System.out.println(i+++" - "+currentVar);
        currentVar++;
        //for(i = 0; i < 65535; i++) {
        System.out.println(i+++" - "+currentVar);
        while(currentVar != 0) {
            System.out.println(i+++" - "+currentVar);
            currentVar++;
        }
    }
}