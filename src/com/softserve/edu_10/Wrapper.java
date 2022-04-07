package com.softserve.edu_10;
/*
- Create Wrapper<T> class with private field of T type which is called value.
- In Wrapper class create public constructor and setValue and getValue methods for value field.
- Create three objects of the Wrapper type: first object should be wrapper for int type, second – for String, third - for boolean.
- Print all three values in the console using method getValue from Wrapper class.
 */
public class Wrapper<T> {
    private T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
