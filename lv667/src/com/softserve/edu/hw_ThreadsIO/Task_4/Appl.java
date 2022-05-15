package com.softserve.edu.hw_ThreadsIO.Task_4;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Appl {
    public static final String FILE_TO_WRITE = "/home/dimoybiyca/IdeaProjects/lv667/src/com/softserve/edu/hw_ThreadsIO/Task_4/file2";
    public static final String FILE_TO_READ = "/home/dimoybiyca/IdeaProjects/lv667/src/com/softserve/edu/hw_ThreadsIO/Task_4/file1";

    public static final String regexGetName = "name is [A-Z][a-z]+";
    public static final String regexGetBirthday = "\\s[0-3][0-9]\\.[0-1][0-9]\\.[1-2][0-9]{3}";

    public static void main(String[] args) {
        ArrayList<String> file = new ArrayList<>();

        try {
            file = readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Reading error, check if the file exists");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Reading error, check path");
        }

        try {
            createFile(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Writing error, check if the path is available");
        }
    }

    public static void createFile(ArrayList<String> list) throws FileNotFoundException {
        File file = new File(FILE_TO_WRITE);
        try(PrintWriter pw = new PrintWriter(file)) {

            ArrayList<String> data = analyze(list);

            pw.println("Number of lines: " + data.get(0));
            pw.println("Max length     : " + data.get(1));
            pw.println("Name           : " + data.get(2));
            pw.println("Birthday       : " + data.get(3));
        }
    }

    public static ArrayList<String> readFile() throws IOException {
        ArrayList<String> data = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(FILE_TO_READ))) {
            String line;

            while (((line = br.readLine()) != null)) {
                data.add(line);
            }
        }

        return data;
    }

    public static ArrayList<String> analyze(ArrayList<String> list){
        ArrayList<String> res = new ArrayList<>();

        Stream<String> stream = list.stream();

        //number of lines
        res.add(String.valueOf(list.size()));

        //the longest line
        String temp = String.valueOf(stream
                .max(Comparator.comparing(String::length))
        );

        res.add(String.valueOf(temp.length()));

        // name
        res.add(findRegex(list, regexGetName).substring(7));

        res.add(findRegex(list, regexGetBirthday));

        return res;
    }

    public static String findRegex (ArrayList<String> list, String regex){
        String res = "Not Specified";

        for (String text : list) {

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                res = text.substring(matcher.start() + 1, matcher.end());
            }
        }

        return res;
    }
}
