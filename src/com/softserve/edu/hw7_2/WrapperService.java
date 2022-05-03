package com.softserve.edu.hw7_2;

public class WrapperService {
     Wrapper<Integer> w1=new Wrapper<>(4444);
     Wrapper<String> w2=new Wrapper<>("Done");
     Wrapper<Boolean> w3=new Wrapper<>(true);

     Wrapper[] arrayWrapper={w1,w2,w3};

     public void print(){
         for (Wrapper arr:arrayWrapper) {
             System.out.println(arr.getValue()+"\n");

         }
     }
}
