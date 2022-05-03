package com.softserve.edu.String_RegularExpressions.Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        ArrayList<String> byWord = new ArrayList<>();
        String sentence = "";
        int maxLen = -1;
        String longest = "";
        String reverseSecond = "";


        System.out.println("Input sentence");

        Scanner cin = new Scanner(System.in);
        sentence = cin.nextLine();


        /// Search the longest ///

        for(String str: sentence.split(" ")){
            byWord.add(str);

            if(str.length() > maxLen){
                maxLen = str.length();
                longest = str;
            }
        }

        // Search the longest //


        System.out.println("Original :");
        System.out.println(sentence);


        /// Reverse second ///
        if(byWord.size() > 0) {
            StringBuilder temp = new StringBuilder();
            temp.append(byWord.get(1));
            temp.reverse();
            reverseSecond = String.valueOf(temp);
        }
        // Reverse second //

        System.out.println("\nThe longest word : " + longest);
        System.out.println("Number of letters: " + maxLen);
        System.out.println("Second reverse: " + reverseSecond);
    }
}
