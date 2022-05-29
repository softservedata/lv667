package com.softserve.edu.hw.hw10.task1;

public class Appl {
    public static void main(String[] args) {
        SentenceLoader line = new SentenceLoader();
        System.out.println("The longest word in a sentence is :" + line.longestWord());
        System.out.println("The 2nd word in reverse form is :" + line.secondReversed());
    }
}