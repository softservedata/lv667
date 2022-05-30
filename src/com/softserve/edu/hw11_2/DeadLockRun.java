package com.softserve.edu.hw11_2;

public class DeadLockRun{
    public static void main(String[] args){
        final String r1 = "resource1";
        final String r2 = "resource2";

        Thread t1 = new Thread() {
            public void run(){
                synchronized(r1){
                    System.out.println("Thread 1: Locked r1");
                    try{ Thread.sleep(50);}
                    catch(InterruptedException e) {
                    }
                    synchronized(r2){
                        System.out.println("Thread 1: Locked r2");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run(){
                synchronized(r2){
                    System.out.println("Thread 2: Locked r2");
                    try{ Thread.sleep(50);
                    }
                    catch(InterruptedException e) {
                    }
                    synchronized(r1){
                        System.out.println("Thread 2: Locked r1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}


