package com.softserve.edu.hw.hw8.task2;

public class Wrapper <T>{
    private T value;

    public Wrapper(T value){
        setValue(value);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
