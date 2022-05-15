package com.softserve.edu.hw_Nested_Inner_clases.Task_2;

public class Appl {
    public static void main(String[] args) {
        Wrapper intWrapper = new Wrapper(10);
        Wrapper StringWrapper = new Wrapper("Доброго вечора ми з України");
        Wrapper boolWrapper = new Wrapper(true);

        System.out.println(intWrapper.getValue());
        System.out.println(StringWrapper.getValue());
        System.out.println(boolWrapper.getValue());
    }
}
