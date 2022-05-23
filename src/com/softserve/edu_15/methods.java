package com.softserve.edu_15;

import java.util.Arrays;

public class methods {
    public static String encrypt(String s, int n) {
        char[] alphabet = s.toCharArray();
        char[] convertString = new char[alphabet.length];
        char c;
        int z = 0;
        for (int i = 0 ; i < alphabet.length ; i++ ){
            c = alphabet[i];
            if(z < n) {
                convertString[i] = ++alphabet[i];
            }
        }
        s = Arrays.toString(convertString);
        s = s.replaceAll(",","");
        return s;
    }
    public static String decrypt (String s , int n ){
        char[] alphabet = s.toCharArray();
        char[] convertString = new char[alphabet.length];
        char c;
        int z = 0;
        for (int i = 0 ; i < alphabet.length ; i++ ){
            c = alphabet[i];
            if(z < n) {
                convertString[i] = alphabet[i] --;
            }
        }
        s = Arrays.toString(convertString);
        s = s.replaceAll(",","");
        return s;
    }
}