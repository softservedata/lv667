package com.softserve.edu_11;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersect {
    public static void union(Set setOne, Set setTwo){
        Set <Integer> uniSet = new HashSet<>(setOne);
        uniSet.addAll(setTwo);
        System.out.println(uniSet);
    }
    public static void intersect (Set setOne, Set setTwo){
        Set <Integer> interSet = new HashSet<>(setOne);
        interSet.retainAll(setTwo);
        System.out.println(interSet);
    }

    public static void main(String[] args) {
        Set <Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(5);
        Set <Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(4);
        set2.add(1);
        set2.add(2);
        union(set1,set2);
        intersect(set1,set2);
    }
}
