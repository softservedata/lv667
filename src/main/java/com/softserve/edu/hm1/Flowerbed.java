package com.softserve.edu.hm1;

public class Flowerbed {
    private Integer radius;
    private Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    Flowerbed(Integer radius){
        setRadius(radius);
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public double getArea(){
        return Math.PI* Math.pow(radius,2);
    }
}
