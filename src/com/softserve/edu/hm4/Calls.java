package com.softserve.edu.hm4;
import java.util.InputMismatchException;

public class Calls {
    //Class variables
    private float priceUA;      // priceUA
    private float pricePL;      // pricePL
    private float priceENG;     // priceENG
    private float timeTalkUA;   //
    private float timeTalkPL;
    private float timeTalkENG;

    // Setters - Getters
    public float getPriceUA() { return priceUA; }
    public void setPriceUA(float value) {this.priceUA = value;}
    public float getPricePL() {return pricePL;}
    public void setPricePL(float value) {this.pricePL = value;}
    public float getPriceENG() {return priceENG;}
    public void setPriceENG(float value) { this.priceENG = value;}
    public float getTimeTalkUA(){return timeTalkUA;}
    public void setTimeTalkUA(float value){this.timeTalkUA = value;}
    public float getTimeTalkPL() {return timeTalkPL;}
    public void setTimeTalkPL(float value) {this.timeTalkPL = value;}
    public float getTimeTalkENG() {return timeTalkENG;}
    public void setTimeTalkENG(float value) {this.timeTalkENG = value;}

    // Constructor
    Calls(){
        setPriceUA(6.7f);
        setPricePL(5.5f);
        setPriceENG(12.7f);
    }

    // calculating result price for the call
    public float calculateBillUA(){
        return getPriceUA()*getTimeTalkUA();
    }

    public float calculateBillPL(){
        return getPricePL()*getTimeTalkPL();
    }

    public float calculateBillENG(){
        return getPriceENG()*getTimeTalkENG();
    }

    public void getInfo(String value) {
        switch (value){
            case "UA":
                System.out.println(calculateBillUA());
                break;
            case "PL":
                System.out.println(calculateBillPL());
                break;
            case "ENG":
                System.out.println(calculateBillENG());
                break;
            case "All":
                System.out.println("total time for all calls is:" + (calculateBillENG() + calculateBillPL()+ calculateBillUA()));
            default:
                System.out.println("sorry, uknown input parameters.");
        }
    }
}
