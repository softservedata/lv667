package com.softserve.edu.hw.hw10.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {
    public static void main(String[] args) {

        String text1= "Social Security takes up the largest portion of the mandatory spending dollars.\nIn fact, Social Security demands $1.046 trillion of the total $2.739-trillion mandatory spending budget.";
        String text2= "The federal budget for the 2020 fiscal year was set at $479.12 trillion.";

        Pattern p = Pattern.compile("\\$\\d+.?[0-9][0-9]");
        Matcher m = p.matcher(text1);

        System.out.println("Text :" + text1);
        while (m.find())
            System.out.println("Found [" + m.group() + "] starting at "
                    + m.start() + " and ending at " + (m.end() - 1));

        System.out.println("\nText :" + text2);
        Matcher m2 = p.matcher(text2);
        while (m2.find())
            System.out.println("Found [" + m2.group() + "] starting at "
                    + m2.start() + " and ending at " + (m2.end() - 1));
    }
}