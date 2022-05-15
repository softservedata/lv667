package com.softserve.edu.hw_ThreadsIO.Task_1;


public class Appl {
    public static final Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread Start");

        Runnable run1 = () -> {
            synchronized (Appl.monitor) {
                System.out.println("\n\tThread 1 Start");

                for (int i = 0; i < 5; i++) {
                    System.out.println("\t\t=====  Hello from Thread 1  =====");
                }
                System.out.println("\tThread 1 Finish\n");
            }
        };

        Runnable run2 = () -> {
            synchronized (Appl.monitor) {
                System.out.println("\n\tThread 2 Start");

                for (int i = 0; i < 5; i++) {
                    System.out.println("\t\t=====  Hello from Thread 2  =====");
                }
                System.out.println("\tThread 2 Finish\n");
            }
        };

        Runnable run3 = () -> {
            synchronized (Appl.monitor) {
                System.out.println("\n\tThread 3 Start");

                for (int i = 0; i < 5; i++) {
                    System.out.println("\t\t=====  Hello from Thread 3  =====");
                }
                System.out.println("\tThread 3 Finish\n");
            }
        };

        var thread1 = new Thread(run1);
        var thread2 = new Thread(run2);
        var thread3 = new Thread(run3);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        thread3.start();
        thread3.join();

        System.out.println("Main thread Finish");
    }
}
