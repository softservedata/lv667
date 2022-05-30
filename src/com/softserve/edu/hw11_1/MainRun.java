package com.softserve.edu.hw11_1;

public class MainRun {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        Runnable r1 = new Thread3();
        Thread t3 = new Thread(r1);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
        } catch (InterruptedException e1) {
            System.out.println(e1);
        }
        try {
            t2.join();
        } catch (InterruptedException e2) {
            System.out.println(e2);
        }
        try {
            t3.join();
        } catch (InterruptedException e3) {
            System.out.println(e3);
        }
        System.out.print("Main Thread ID = " + Thread.currentThread().getId());
    }
}
