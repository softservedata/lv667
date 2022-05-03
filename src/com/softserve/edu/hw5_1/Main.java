package com.softserve.edu.hw5_1;

public class Main {
    public static void main(String[] args) {

        Bird [] birds= {
                new Eagle(3.5,50,24,"hight",3),
                new Swallow(0.4,10,5,"low",6),
                new Chiken(16,6,"low",9),
                new Pinguine(18,7,"middle",3)
        };

        for(int i=0;i< birds.length;i++){
            System.out.println("Bird number:"+ (i+1) + birds[i].fly()+" "+birds[i].toString() +"\n");
        }


    }
}
