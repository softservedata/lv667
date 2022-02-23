package com.softserve.hw05.HW_01;

public class MainBird {
    public static void main(String[] args) {
        Bird [] birds = new Bird[4];
        birds[0]=new Swallow ("long white",true);
        birds[1]=new Eagle("long black", false);
        birds[2]=new Chicken("colorful short",true);
        birds[3]=new Penguin("black and white",true);

        for (int i = 0; i < birds.length; i++) {
            birds[i].print();
            birds[i].fly();
        }
    }


}
