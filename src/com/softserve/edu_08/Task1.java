package com.softserve.edu_08;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Bird bird [] = new Bird[4];
        bird[0] = new Eagle("Huge","Black", "Yes");
        bird[1] = new Swallow("Huge","Black", "Yes");
        bird[2] = new Penguin("Huge","White", "Yes");
        bird[3] = new Chicken("Huge","Red", "Yes");

        System.out.println(Arrays.toString(bird));
    }
}
