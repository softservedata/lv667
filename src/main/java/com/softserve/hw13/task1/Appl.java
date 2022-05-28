package com.softserve.edu.hw13.task1;

import java.util.ArrayList;
import java.util.List;

public class Appl {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>(){{
            add("class");
            add("remarkable");
            add("notable");
            add("attendance");
            add("run");
            add("our");
            add("most");
            add("words");
            add("the");
            add("who");
            add("Get");
            add("list");
            add("acquiesce");
        }};

        System.out.println(list1 + " size = " + list1.size());

        // removeIf
        list1.removeIf(x -> x.length()<5);
        System.out.println(list1 + " size after removeIf = " + list1.size());

    }
}
