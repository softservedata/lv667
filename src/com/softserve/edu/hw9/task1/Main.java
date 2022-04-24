package com.softserve.edu.hw9.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create two different Set objects
        Set<Fullname> set1 = new HashSet<>();
        Set<Fullname> set2 = new HashSet<>();

        // Fill first HashSet object
        Collections.addAll(set1,
                new Fullname("Elizabeth", "Stuart"),
                new Fullname("Louis", "III"),
                new Fullname("Henry", "Stuart"),
                new Fullname("Mary", "Stuart")
        );

        // Fill second HashSet object
        Collections.addAll(set2,
                new Fullname("Elizabeth", "Stuart"),
                new Fullname("Louis", "III"),
                new Fullname("Margaret", "Stuart")
        );

        System.out.println("HasSet #1 : " + set1);
        System.out.println("HasSet #2 : " + set2);

        // union two HashSet objects
        System.out.println("The Union of two HashSet objects: " + union(set1, set2));

        // intersect two HashSet objects
        System.out.println("The Intersect of two HashSet objects: " + intersect(set1,set2));
    }

    /*
    * parameterized methods union(Set set1, Set set2)
    * */
    public static <T> Set<T> union(Set<T> s1, Set<T> s2){
        Set <T> commonSet = new HashSet<>();
        for(T elem:s1){
            commonSet.add(elem);
        }
        for(T elem:s2){
            commonSet.add(elem);
        }
        return commonSet;
    }

    /*
     * parameterized methods intersect(Set set1, Set set2)
     * */
    public static <T> Set<T> intersect(Set<T> s1, Set<T> s2){ //
        List<T> list = new ArrayList<>();
        list.addAll(s1);
        list.addAll(s2);

        Set <T> intersectionSet = new HashSet<>();
        for(int i=0; i<=list.size()-2; i++){
            for(int j=i+1; j<=list.size()-1; j++){
                if(list.get(i).equals(list.get(j))){
                    intersectionSet.add(list.get(i));
                    break;
                }
            }
        }
        return intersectionSet;
    }
}

