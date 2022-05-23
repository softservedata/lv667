package com.softserve.edu_12;

import java.util.Scanner;

/*
Enter in the console sentence of five words.
display the longest word in the sentence
determine the number of its letters
bring the second word in reverse order
 */
public class App {
    public static void main(String[] args) {
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String resoult = "";
        String [] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length() > resoult.length()){
                x = arr[i].length();
                resoult = arr[i];
            }
        }
        System.out.println("The longest word is: " +  resoult + " its length: " + x );
        StringBuilder sb = new StringBuilder(arr[1]);
        System.out.println("The second word reverse: " + sb.reverse());
    }
}
