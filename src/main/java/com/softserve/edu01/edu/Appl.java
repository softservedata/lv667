package com.softserve.edu01.edu;

/**
 * Class Appl.
 */
public class Appl {
	private int i = 123;

	// Default constructor Appl() added by JDK, if any not exist

//	public Appl(int i0) {
//		i = i0;
//	} 

	public void myprint() {
		System.out.println("Appl i = " + i); // i convert toString()
		// main(new String[]{"dd", "ff"});
	}

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		System.out.println("Dev");
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
		k = (byte) (k + 1);
		//
		com.softserve.edu01.A a = new com.softserve.edu01.A();
		System.out.println("a = " + a); // toString();
		com.softserve.edu02.A a2 = new com.softserve.edu02.A();
		System.out.println("a2 = " + a2); // toString();
	}

}
