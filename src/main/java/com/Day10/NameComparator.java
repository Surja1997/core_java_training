package com.Day10;

import java.util.Comparator;

public class NameComparator implements Comparator<Student1> {


    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.getName().compareTo(s2.getName());
    }


}
