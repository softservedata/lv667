/*
* Copyright (c) Sun Microsystems, Inc.
* This software is …
*/
package com.softserve.edu20stryle;

/**
 * Class description goes here.
 * @version 1.82 18 Mar 2016
 * @author Firstname Lastname
 */
public final class Appl {
    /* A class implementation comment can go here. */

    /** classVar1 documentation comment. */
    public static final int CLASSVAR1 = 1;

    /**
     * SuperConstructor.
     */
    private Appl() {
    }

    /**
     * The <b> <font color="red">main</font> method.</b>
     * @param args Parameters from command line.
     */
    public static void main(final String[] args) {
        System.out.println("Hello");
    }

    /*-
     * Here is a block comment with some very special
     * formatting that I want indent(1) to ignore.
     * one
     *          two
     *                   three
     */

    /**
     * Test.
     * @return int
     */
    public static int methodName() {
        // method body with a return statement
        return 1;
    }

}
