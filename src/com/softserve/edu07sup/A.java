package com.softserve.edu07sup;

import java.util.Objects;

public class A {
    private int id;
    private String name;


    public A() {
        id = -1;
        name = "";
    }

    public A(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return id == a.id && Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public void m1() {
        System.out.println("A public void m1()");

    }
}
