package com.softserve.edu.hw11_1;

public class Thread3 implements Runnable {
    public void run (){
        int j=0;
        for(int i=0;i<5;i++){
            j++;
            System.out.println("Thread3 run "+ j);
        }
        System.out.println("Thread3 ID = " + Thread.currentThread().getId());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);;
        }
    }
}
