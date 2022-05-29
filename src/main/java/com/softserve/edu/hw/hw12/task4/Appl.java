package com.softserve.edu.hw.hw12.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Appl {
    public static void main(String[] args) {

        String src = "data/file1.txt";
        String dst = "data/file2.txt";
        String text = "text";

        List<String> rows = new ArrayList<>();

        try(FileReader input = new FileReader(src);
            FileWriter output = new FileWriter(dst)){

            BufferedReader reader = new BufferedReader(input);
            while(reader.ready()){
                rows.add(reader.readLine());
            }

            BufferedWriter writer = new BufferedWriter(output);
            writer.write("number of rows :" + rows.size()+'\n');
            writer.write("text:" + getLongestRow(rows)+'\n');
            writer.write("FirstName:Vsevolod\nLastNAme:Barnash");
            writer.close();

        }catch(FileNotFoundException e){
            System.out.println("Something went wrong" + e);
        }catch(IOException e){
            System.out.println("Something went wrong" + e);
        }
    }

    public static String getLongestRow(List<String> rows){
        String longestRow = "";
        int rowLength = 0;
        for(String raw:rows){
            if(raw.length()>rowLength){
                rowLength = raw.length();
                longestRow = raw;
            }
        }
        return longestRow;
    }
}