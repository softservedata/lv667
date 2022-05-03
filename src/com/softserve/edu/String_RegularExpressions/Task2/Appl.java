package com.softserve.edu.String_RegularExpressions.Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        String sentence = "";

        System.out.println("Input sentence");

        Scanner cin = new Scanner(System.in);
        sentence = cin.nextLine();

        System.out.println("Original :");
        System.out.println(sentence);

        String trimmed = sentence.replaceAll("\\s+", " ");

        System.out.println("\nAfter trim :");
        System.out.println(trimmed);
    }
}
