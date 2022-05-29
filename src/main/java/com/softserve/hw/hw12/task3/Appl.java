package com.softserve.hw.hw12.task3;

public class Appl {
    public static void main(String[] args) {

        Thread t2 = new Thread(() -> {
            for(int i=0; i<3; i++){
                System.out.println("Thread number two");
            }
            Thread t3 = new Thread(() -> {
                for(int i=0; i<5; i++){
                    System.out.println("Thread number three");
                }
            });
            t3.start();
        });

        Thread t1 = new Thread(() -> t2.start());
        t1.start();
    }
}
