package com.softserve.edu.hw5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * TASK 2:
 * Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive
 * or product of last 5 element in the other case.
 * */

public class FirstFive {
    private int arraySize;
    private int[] arrayOfNumbers;

    // Constructor
    public FirstFive(int size){
        setArraySize(size);
    }

    // Setters - Getters
    public int getArraySize() {return arraySize;}
    public void setArraySize(int arraySize) {this.arraySize = arraySize;}
    public int[] getArrayOfNumbers() {return arrayOfNumbers;}
    public void setArrayOfNumbers() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arrayOfNumbers = new int[getArraySize()];
        for(int i=0 ; i<getArraySize(); i++){
            System.out.println("enter element number " + i + " :");
            try {
                this.arrayOfNumbers[i] = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void sumOrProduct(){
        int sumFirstFive=0;
        int productLastFive=1;
        boolean firstFivePositive=true;

        for(int i=0; i<arrayOfNumbers.length/2; i++){
            if(arrayOfNumbers[i]>0 && firstFivePositive){
                sumFirstFive+=arrayOfNumbers[i];
            }
            else{
                firstFivePositive=false;
            }
        }

        if(firstFivePositive){
            System.out.println("the sum of first 5 elements if they are positive = " + sumFirstFive);
        }
        else{
            for(int j=arrayOfNumbers.length/2; j<arrayOfNumbers.length; j++){
                productLastFive *= arrayOfNumbers[j];
            }
            System.out.println("product of last 5 element = " + productLastFive);
        }
    }
}
