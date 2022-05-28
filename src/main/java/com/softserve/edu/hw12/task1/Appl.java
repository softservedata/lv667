package com.softserve.edu.hw12.task1;

public class Appl {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new RunnThread("Thread-1 -> message - 1").getTextThread();
        Thread t2 = new RunnThread("Thread-2 -> message - 2").getTextThread();
        Thread t3 = new RunnThread("Thread-3 -> message - 3").getTextThread();

        t1.start();
        t2.start();
        // prioritize threads t1 and t2
        t1.join();
        t2.join();
        // start thread t3 after finishing working of the two previous threads.
        t3.start();
    }
}
