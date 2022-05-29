package com.softserve.hw.hw10.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SentenceLoader {
    private List<String> wordsList;

    public SentenceLoader(){
        setWordsList();
    }

    public List<String> getWordsList(){
        return wordsList;
    }

    public void setWordsList() {
        System.out.print("Would you be so kind to enter a five words sentence : ");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
            String words[] = reader.readLine().split(" ");
            this.wordsList = new ArrayList<>(List.of(words));
        }catch (IOException e){
            System.out.println("something went wrong! error ->" + e.getMessage());
        }
    }

    public String longestWord(){
        int maxLength = 0;
        String targetWord = "";
        for(String elem: this.wordsList){
            if(elem.length() > maxLength){
                maxLength = elem.length();
                targetWord = elem;
            }
        }
        return targetWord;
    }

    public String secondReversed(){
        String reverse="";
        for(int i=wordsList.get(1).length()-1;i>=0;i--)
        {
            reverse = reverse+wordsList.get(1).charAt(i);
        }
        return reverse;
    }
}
