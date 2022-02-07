package com.softserve.edu_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H4r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hi. What is your name?");
        String name = br.readLine();
        System.out.println("How old are you?");
        int age = Integer.parseInt(br.readLine());
        System.out.println("How are you my friend?");
        String friend = br.readLine();
        System.out.println("Hello " + name);
        System.out.println("Your are " + age);
        System.out.println("Good " + name + " i'm glad for you");
    }
}
