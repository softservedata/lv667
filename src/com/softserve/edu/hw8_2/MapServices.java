package com.softserve.edu.hw8_2;

import java.util.HashMap;
import java.util.Map;

public class MapServices {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>(10);

        personMap.put("Igor","Ivanov");
        personMap.put("Ivan","Kostenko");
        personMap.put("Ivan","Balabash");
        personMap.put(new String("Ivan"),"Petrovuch");
        personMap.put("Taras","Babyak");
        personMap.put("Oleh","Ivanets");
        personMap.put("Yura","Dolgorukij");
        personMap.put("Arsen","Korin");
        personMap.put("Ira","Korinets");
        personMap.put("Ivanna","Bogun");
        personMap.put("Halyna","Bosko");

        System.out.println("personMap: "+ personMap);
        System.out.println("mapSize: "+personMap.size());
        System.out.println("Get from key \"Ivan\": "+personMap.get("Ivan"));

        System.out.println("Print all key :"+personMap.keySet());
        System.out.println("If personMap contains key \"Oleh\" : "+personMap.containsKey("Oleh"));
        System.out.println(personMap.replace("Taras","Babyak","Kostushun"));
        System.out.println("Changed Taras Babyak to Kostushun :"+personMap.get("Taras"));
        personMap.remove("Arsen");
        System.out.println("Remove Arsen from personMap: "+personMap);
        System.out.println("Map size after remove Arsen: "+personMap.size());
        System.out.println("Обхід по Мапі через внутрішній сет");
        for(Map.Entry<String,String> entry1: personMap.entrySet()){
            System.out.println("key= "+entry1.getKey()+" value= "+entry1.getValue());
        }
    }
}
