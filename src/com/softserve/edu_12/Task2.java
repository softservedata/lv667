package com.softserve.edu_12;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String enterSentence = "Summer    changes     spring   as   winter    changes    autumn";
        System.out.println(" Before : \"" + enterSentence + "\"");
        enterSentence = enterSentence.replaceAll("\\s+","`");
        enterSentence = enterSentence.replaceAll("`"," ");
        System.out.println(" After : \"" + enterSentence + "\"");
    }
}
