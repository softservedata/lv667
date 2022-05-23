package com.softserve.edu_14;
/*Create file1.txt file with a text about your career.
Read context from file into array of strings. Each array item contains one line from file.
Write in to the file2.txt
   1) number of lines in file1.txt.
   2) the longest line in file1.txt.
   3) your name and birthday date.
*/
import java.io.*;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        String HMText = "src/com/com.softserve/edu_14/file1.txt";
        BufferedReader br = null;
        int countForArr = 0;
        String TheLongerLine= ".";
        String nameAndBirthday = " Mukola 22.12.2001";
        try{
            br = new BufferedReader((new FileReader(HMText)));
            String s ;
            for (int i = 0 ;(s = br.readLine())!= null;i++ ,countForArr ++){
                System.out.println((i+1) + ") " +  s);
            }
            String []arr = new String[countForArr];
            br = new BufferedReader((new FileReader(HMText)));
            for (int i = 0 ; i<arr.length ; i++){
                arr[i] = br.readLine();
                TheLongerLine = (TheLongerLine.length() < arr[i].length())?arr[i] :TheLongerLine;
            }
            System.out.println(Arrays.toString(arr));
            br.close();
        }catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        String fileName = "file2.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            System.out.println("Write data to file : " + fileName);
            bw.write(countForArr);
            bw.write(TheLongerLine);
            bw.write(nameAndBirthday);
            bw.close();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}