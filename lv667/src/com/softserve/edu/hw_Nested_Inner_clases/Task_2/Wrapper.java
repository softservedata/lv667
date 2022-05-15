package com.softserve.edu.hw_Nested_Inner_clases.Task_2;

public class Wrapper<T> {
    private T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public T    getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
