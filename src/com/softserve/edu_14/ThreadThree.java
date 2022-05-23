package com.softserve.edu_14;

public class ThreadThree extends Thread{
    //fields
    private String text;
    //constructor
    public ThreadThree(String text) {
        this.text = text;
    }
    //method
    public void run (){
        for (int i = 0 ; i < 5 ; i++){
            System.out.println(text);
        }
    }
}