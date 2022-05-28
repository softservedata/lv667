package com.softserve.edu.hw10.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpaceEater {
    private StringBuilder sentence;

    public SpaceEater(){
        setSentence();
    }

    public StringBuilder getSentence() {
        return sentence;
    }

    public void setSentence() {
        System.out.print("Would you be so kind to enter a sentence :");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
            sentence = new StringBuilder(reader.readLine());
        }catch (IOException e){
            System.out.println("something went wrong! error ->" + e.getMessage());
        }
    }

    public StringBuilder eatSpaces(){
        StringBuilder sb = new StringBuilder();
        boolean isFirstBlank = true;
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i) != ' '){
                sb.append(sentence.charAt(i));
                isFirstBlank = true;
            }else if((sentence.charAt(i) == ' ' && isFirstBlank)){
                sb.append(sentence.charAt(i));
                isFirstBlank = false;
            }
        }
        return sb;
    }
}
