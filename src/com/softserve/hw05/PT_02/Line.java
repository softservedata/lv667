package com.softserve.hw05.PT_02;

public class Line {
    Point pointOne = new Point(5,7);
    Point pointTwo = new Point(0,2);

    @Override
    public String toString() {
        return "Line{" +
                "pointOne=" + pointOne +
                ", pointTwo=" + pointTwo +
                '}';
    }
    public void print(){
        System.out.println(toString());
    }

}
