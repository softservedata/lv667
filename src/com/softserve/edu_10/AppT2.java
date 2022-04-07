package com.softserve.edu_10;
/*
- Create Wrapper<T> class with private field of T type which is called value.
- In Wrapper class create public constructor and setValue and getValue methods for value field.
- Create three objects of the Wrapper type: first object should be wrapper for int type, second – for String, third - for boolean.
- Print all three values in the console using method getValue from Wrapper class.
 */
public class AppT2 {
    public static void main(String[] args) {
        Wrapper<Integer> object1 = new Wrapper<>(35);
        Wrapper<String> object2 = new Wrapper<>("Text");
        Wrapper<Boolean> object3 = new Wrapper<>(true);
        System.out.println(object1.getValue() + "\n" + object2.getValue() + "\n" + object3.getValue());
    }
}
