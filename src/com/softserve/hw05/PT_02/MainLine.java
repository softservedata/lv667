package com.softserve.hw05.PT_02;

public class MainLine {
    public static void main(String[] args) {
        Line [] lines = new Line[2];
        lines [0]= new Line();
        lines [1]= new ColorLine("Red");
        for (int i = 0; i < lines.length; i++) {
            lines[i].print();
        }
    }
}
