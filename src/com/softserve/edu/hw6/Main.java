package com.softserve.edu.hw6;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Check_belong objInput = new Check_belong();
        Check_belong objProcess = new Check_belong(objInput.inputFloat("Enter n1"), objInput.inputFloat("Enter n2"), objInput.inputFloat("Enter n3"));
        objProcess.areBelongQ();
    }
}
