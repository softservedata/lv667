package com.softserve.edu.hw6;

import java.util.Scanner;

public class Check_belong {
    private float n1, n2, n3;


    public float inputFloat(String txt) {
        Scanner floatValue = new Scanner(System.in);
        System.out.println(txt);
        return floatValue.nextFloat();
    }

    public Check_belong() {

    }

    public Check_belong(float n1, float n2, float n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void areBelongQ() {
        System.out.println(this.n1);
        System.out.println(this.n2);
        System.out.println(this.n3);
        if(-5 <= this.n1 & this.n1 <= 5 & -5 <= this.n2 & this.n2 <= 5 & -5 <= this.n3 & this.n3 <= 5){
            System.out.println("All floats belong to the range -5, 5");
        } else {
            System.out.println("Some floats don't belong to the range -5, 5");
        }

    }


}
