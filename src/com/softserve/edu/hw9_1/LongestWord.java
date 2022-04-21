package com.softserve.edu.hw9_1;


public class LongestWord {
    public static void main(String[] args) {

        String s1 = new String();
        for (int i = 0; i < args.length; i++) {
            s1 = s1 + args[i] + " ";
        }

        System.out.println("Print sentence from console: " + s1);

        String[] arr = s1.split(" ");
        String str1 = new String();
        for (int i = 0; i < arr.length; i++) {
            if (str1.length() < arr[i].length()) {
                str1 = arr[i];
            }
        }
        System.out.printf("The longest word in the sentence is: %s \nThe number of its letters: %d \n"
                , str1, str1.length());
    }
}


