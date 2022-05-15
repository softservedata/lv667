package com.softserve.edu.hw_ThreadsIO.Task_3;

public class Appl {
    public static void main(String[] args) {
        Runnable r3 = () -> {
            Thread.currentThread().setName("Thread-3");
            for(int i=0; i<5; i++){
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread thread_3 = new Thread(r3);

        Runnable r2 = () -> {
            Thread.currentThread().setName("Thread-2");
            for(int i=0; i<3; i++){
                System.out.println(Thread.currentThread().getName());
            }

            thread_3.start();
        };

        Thread thread_2 = new Thread(r2);

        Runnable r1 = () -> {
            thread_2.start();
        };

        Thread t1 = new Thread(() -> thread_2.start());
        t1.start();
    }
}