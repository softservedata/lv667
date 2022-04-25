package com.softserve.edu.hw9.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<String, String>() {{
            put("Stuart","Elizabeth");
            put("Armstrong-Jones","Antony");
            put("Hyde","Anne");
            put("McLory","Anne");
            put("Mozzi","Mapelli");
            put("Laurence", "Timothy");
            put("Ferguson","Sarah");
            put("Rhys-Jones","Sophie");
            put("Middleton","Catherine");
            put("Markle","Meghan");
            put("Phillips","Mark");
            put("Augustus","Ernest");
        }};

        // 1-output the entities of the map on the screen.
        System.out.println("------------------1-output the entities of the map on the screen.-----------------------");
        for (Map.Entry entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        // 2-there are at less two persons with the same firstName among these 10 people?
        System.out.println("------------------2-Duplicates in values -----------------------------------------------");
        System.out.println("Does Hashmap includes duplicates in values : " + hasValueDuplicates(personMap));

        // 3-Remove from the map person whose firstName is ”Orest” (or other). Print result.
        List<String> namesToRemove = new ArrayList<String>(List.of("Sarah","Ernest","Mark","Mapelli","Meghan"));
        for (String name : namesToRemove) {
            System.out.println(name + " : " + personMap.values());
            personMap.values().remove(name);
        }

        System.out.println("------------------3-Remove from the map person whose firstName is in the list----------");
        for (Map.Entry entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

    public static <T> boolean hasValueDuplicates(Map<T, T> map){
        Collection<T> valuesList =  map.values();
        Set<T> valuesSet = new HashSet<>(map.values());
        return valuesList.size() > valuesSet.size()? true : false;
    }
}