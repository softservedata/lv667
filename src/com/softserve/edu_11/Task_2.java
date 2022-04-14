package com.softserve.edu_11;

import java.util.HashMap;
import java.util.Map;

/*
Write parameterized methods union(UnionAndIntersect set1, UnionAndIntersect set2) and intersect(UnionAndIntersect set1, UnionAndIntersect set2), realizing the
operations of union and intersection of two sets. Test the operation of these techniques on two pre-filled sets.
 */
/*
Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
Output the entities of the map on the screen.
There are at less two persons with the same firstName among these 10 people?
Remove from the map person whose firstName is ”Orest” (or other). Print result.

 */
public class Task_2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("001", "101");
        personMap.put("002", "201");
        personMap.put("003", "301");
        personMap.put("004", "401");
        personMap.put("005", "Orest");
        personMap.put("006", "Orest");
        personMap.put("007", "601");
        personMap.put("008", "701");
        personMap.put("009", "801");
        personMap.put("010", "Orest");
        System.out.println(personMap);
        getForstName(personMap,"Orest");
        System.out.println(personMap);
    }

    public static void getForstName(Map<String, String> map, String personName) {
    String tempKey = null;
        for (Map.Entry<String, String> element : map.entrySet()) {
            if (personName.equals(element.getValue())) {
                tempKey = element.getKey();
            }
        }
        map.remove(tempKey);
    }
}
