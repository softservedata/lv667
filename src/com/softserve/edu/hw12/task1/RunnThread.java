package com.softserve.edu.hw12.task1;

public class RunnThread {

    private String text;

    public RunnThread(String text){
        this.text = text;
    }

    public Thread getTextThread(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    System.out.println(text);
                }
            }
        });
        return t1;
    };
}
