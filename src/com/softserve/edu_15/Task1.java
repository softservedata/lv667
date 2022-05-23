package com.softserve.edu_15;
/*
There is a list of strings list1. Create a new list list2 that has items from
list1 and length less than 5 characters (use method removeIf).
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
public class Task1 {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("Africa");
        list1.add("Europe");
        list1.add("Asia");
        list1.add("Australia");
        list1.add("North America");
        List<String> list2 = list1.stream()
                .filter(name -> name.length()<=5)
                .collect(Collectors.toList());
        System.out.println("List 1 : " + list1);
        System.out.println("List 2 : " + list2);
    }
}