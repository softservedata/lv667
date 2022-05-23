package com.softserve.edu_14;

public class ThreadsClass extends Thread {
    //fields
    private String word;
    private int pauses;
    //constructor
    public ThreadsClass(int pauses , String word) {
        this.word = word;
        this.pauses = pauses;
    }
    //method
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(pauses);
                System.out.println(word);
            }
        }catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}
