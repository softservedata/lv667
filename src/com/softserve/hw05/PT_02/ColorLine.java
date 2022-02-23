package com.softserve.hw05.PT_02;

public class ColorLine extends Line {
    String color;

    public ColorLine(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }
    public void print(){
        System.out.println(toString());
    }
}
