package com.softserve.hw01;

import java.util.Scanner;

public class HowAreYou {
    public void answer () {
        Scanner sc = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = sc.nextLine();
        System.out.println("You are " + answer);
        sc.close();
    }
}
