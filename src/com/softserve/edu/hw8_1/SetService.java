package com.softserve.edu.hw8_1;



import java.util.HashSet;
import java.util.Set;

public class SetService {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        boolean b;
        b=set1.add("Igor");
        System.out.println("set1.add(\"Igor\") "+b);
        b=set1.add("Ivan");
        System.out.println("set1.add(\"Ivan\" ) "+b);
        b=set1.add("Taras");
        System.out.println("set1.add(\"Taras\") "+b);
        b=set1.add("Yura");
        System.out.println("set1.add(\"Yura\") "+b);
        b=set1.add("Yura");//
        System.out.println("set1.add(\"Yura\") "+b);
        b=set1.add("Olga");
        System.out.println("set1.add(\"Olga\") "+b);

        System.out.println("______-----______-----______");
        System.out.println("set1 : "+set1);
        System.out.println("______-----______-----______");

        Set<String> set2=new HashSet<>();

        set2.add("Andrij");
        set2.add("Anton");
        set2.add("Orko");
        set2.add("Oleh");
        set2.add("Yura");
        set2.add("Igor");

        System.out.println("set2 :"+set2);
        System.out.println("______-----______-----______");

        Set<String> set3=new HashSet<>();

        set3.addAll(set1);
        System.out.println("set3 add set1: "+set3);
        set3.addAll(set2);
        System.out.println("set3 add set2: "+set3);
        System.out.println("______-----______-----______");
        set1.retainAll(set2);
        System.out.println("retain in set1 to set2 :"+set1);



    }





}

