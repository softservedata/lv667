package com.softserve.edu.hw_OOP_1.Task_1;

public class Appl {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Chicken();

        for (int i = 0; i < 4; i++) {
            birds[i].fly();
        }
    }
}
