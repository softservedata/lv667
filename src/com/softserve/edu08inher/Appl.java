package com.softserve.edu08inher;

public class Appl {
    public static void main(String[] args) {
        /*-
        B b = new B();
        System.out.println("i = " + b.getI());
        */
        /*-
        int i = 1234;
        double d = i;
        System.out.println("i = " + i + "  d = " + d);
        //
        d = 234.51;
        i = (int) d; // Code Smell;
        System.out.println("i = " + i + "  d = " + d);
        */
        /*-
        A a = new A(14);
        System.out.println("i = " + a.getI());
        B b = new B();
        //
        // b=a; // Compile Error
        a = b; // Upcasting
        System.out.println("i = " + a.getI());
        System.out.println("j = " + ((B) a).j); // Code Smell; // Downcasting
        */
        /*-
        A a = new B(); //(15);
        System.out.println("i = " + a.getI());
        if (a instanceof B) {
            System.out.println("j = " + ((B) a).j); // Downcasting
        }
        a.m(); // Code Smell;
        A.m();
        B.m();
        */
        //
        //Base base = new Base(); // Compile Error
        Base b = new B();
        System.out.println("i = " + b.getI());
    }
}
