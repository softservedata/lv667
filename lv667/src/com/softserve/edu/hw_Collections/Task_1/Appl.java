package com.softserve.edu.hw_Collections.Task_1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Appl {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 3; i <= 15 ; i++) {
            set1.add(i);
        }

        for (int i = 0; i < 10 ; i++) {
            set2.add(i);
        }

        HashSet<Integer> resUn = union(set1, set2);
        HashSet<Integer> resIn = intersect(set1, set2);

        System.out.print("Set 1 :");
        System.out.println(set1.toString());
        System.out.print("Set 2 :");
        System.out.println(set2.toString());

        System.out.println("\nUnion: ");
        System.out.println(resUn.toString());

        System.out.println("\nIntersect: ");
        System.out.println(resIn.toString());
    }

    static HashSet<Integer> union(Set set1, Set set2){
        HashSet<Integer> res = new HashSet<>();

        for (Object i: set1){
            res.add((Integer) i);
        }

        for (Object i: set2){
            res.add((Integer) i);
        }

        return res;
    }

    static HashSet<Integer> intersect(Set set1, Set set2){
        HashSet<Integer> temp = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for (Object i: set1){
            temp.add((Integer) i);
        }

        for (Object i: set2){
            if(!temp.add((Integer) i)){
                res.add((Integer) i);
            }
        }

        return res;
    }
}
