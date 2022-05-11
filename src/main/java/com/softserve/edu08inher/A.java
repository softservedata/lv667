package com.softserve.edu08inher;

public class A extends Base { // extends Object {
    private int i = 12;

    public A() {
        System.out.println("constructor A()");
    }

    public A(int i) {
        this.i = i;
        System.out.println("constructor A(int i)");
    }

    public int getI() {
        System.out.println("\tgetI() from A");
        return i;
    }

    public static void m() { // Class method
        System.out.println("\tstatic m() from A");
    }

}
