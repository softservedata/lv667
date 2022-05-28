package com.softserve.edu.hw5;

/*
    *  Enter 5 integer numbers. Find position of second positive number;
    *  minimum and its position in the array.
    *  Organize entering integers until the first negative number.
    * Count the product of all entered even numbers.
    * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CustomArray {
    private int size;
    private int[] array;

    public CustomArray(){
        setSize(5);
        setArray();
    }

    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}
    public String getArray() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
    public void setArray() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        array = new int[getSize()];
        for(int i=0 ; i<getSize(); i++){
            System.out.println("enter element number " + i + " :");
            try {
                this.array[i] = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void getSecondPositive(){
        int positiveCount=0;
        int pos=0;
        for(int i=0; i<array.length; i++){
            if(array[i]>=0){
                positiveCount++;
            }
            if(positiveCount==2){
                pos=i;
                break;
            }
        }
        if(positiveCount==2){
            System.out.println("position of a second positive number : "+pos);
        }else{
            System.out.println("there is no second positive number");
        }
    };

    public void getMin(){
        int pos=0;
        int min=array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]<min){
                min=array[i];
                pos=i;
            }
        }
        System.out.println("minimum in the array = " +min+ " position of the minimum: " + pos);
    };

    public void getProductEvenNumbers(){
        int product=1;
        for(int elem:array){
            if(elem>=0){
                if(elem%2==0){
                    product*=elem;
                }
            }else{
                break;
            }
        }
        System.out.println("the product of all entered even numbers :" +product);
    }
}
