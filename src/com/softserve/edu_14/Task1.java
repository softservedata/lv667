package com.softserve.edu_14;
/*
Run three threads and output there different messages for 5 times. The third thread supposed to start after finishing working of the two previous threads.

 */
public class Task1 {
    public static void main(String[] args) {
        try {
            Thread t1 = new ThreadsClass(10,"word1");
            Thread t2 = new ThreadsClass(10,"word2");
            Thread t3 = new ThreadsClass(10,"word3");
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            t3.start();
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
