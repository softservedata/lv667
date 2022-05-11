package com.softserve.edu08inher;

public class B extends A {
    public int j = 321; // Achitecture (Encapsulation) Error

    public B() {
        // super();
        //super(1);
        System.out.println("constructor B()");
    }

    public B(int j) {
        // super();
        //super(1);
        this.j = j;
        System.out.println("constructor B(int j)");
    }

    @Override
    public int getI() {
        System.out.println("\tgetI() from B");
        return super.getI();
        //return j;
    }

    public static void m() {
        System.out.println("\tstatic m() from B");
    }
    
}