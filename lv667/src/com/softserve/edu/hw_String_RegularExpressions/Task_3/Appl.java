package com.softserve.edu.hw_String_RegularExpressions.Task_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {
    public static void main(String[] args) {
        int i = 0;

        String text = "But I must explain $45.44 to you how all this mistaken idea of denouncing pleasure" +
                " and praising pain was born and I will give you a complete $4.21  account of the system, " +
                "and  $15.32 expound the actual teachings";
        Pattern pattern = Pattern.compile("\\s\\$[0-9]+\\.[0-9]+\\s");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();
            System.out.println(i++ + " " + text.substring(start,end));
        }
    }
}
