package com.softserve.edu.edu16ser;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Student student = new Student("Oleg", "Marko", "text here","qwertyqazwsxedc");
        System.out.println("Origin student = " +student );
        String ser = gson.toJson(student);
        Student uknown =  (Student) gson.fromJson(ser, Student.class);
        System.out.println("de-serialized object = " + uknown);
    }
}
