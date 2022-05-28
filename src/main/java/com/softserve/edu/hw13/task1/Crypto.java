package com.softserve.edu.hw13.task1;

public class Crypto {

    public static String encrypt(String word, int n){
        char[] coded = new char[word.length()];
        for(int i=0; i<word.length(); i++){
            coded[i] = (char)(word.charAt(i) + n);
        }
        return String.valueOf(coded);
    }

    public static String  decrypt(String word, int n){
        char[] decoded = new char[word.length()];
        for(int i=0; i<word.length(); i++){
            decoded[i] = (char)(word.charAt(i) - n);
        }
        return String.valueOf(decoded);
    }

}
