package com.softserve.edu.classwrok;

public class Appl {
	private int i = 123;

	public void myprint() {
		System.out.println("Appl i = " + i); // i convert toString()

	}

	public static void main(String[] args) {
		System.out.println("Hello");
		//
		int i = 456;
		System.out.println("main i= " + i);
		//
		Appl appl1 = new Appl();
		System.out.println("appl1 i = " + appl1.i);
		//
		Appl appl2 = new Appl();
		appl2.i = 321;
		System.out.println("appl2 i = " + appl2.i);
		appl1.myprint();
		//
		for (int i1 = 0; i1 < args.length; i1++) {
			System.out.println("Arg " + i1 + " is " + args[i1]);
		}
		//
		byte k = 49;
		System.out.println("k = " + k + "  char of k = " + (char) k);
	}

}
