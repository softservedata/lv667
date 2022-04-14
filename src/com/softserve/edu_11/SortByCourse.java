package com.softserve.edu_11;

import java.util.Comparator;

public class SortByCourse implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getCourse() - b.getCourse();
    }
}
