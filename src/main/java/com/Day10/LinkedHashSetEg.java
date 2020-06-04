package com.Day10;

import java.util.*;

public class LinkedHashSetEg {

    public static void main(String[] args) {


        Set<Student> lh = new LinkedHashSet();
        Student s1 = new Student(1, "Test1", "Hyyd");
        Student s2 = new Student(2, "Test2", "Blr");
        Student s3 = new Student(3, "Test3", "Mumbai");
        Student s4 = new Student(4, "Test4", "Chennai");
//    Student s5=new Student(4,"Test4","Chennai");

        lh.add(s1);
        lh.add(s2);
        lh.add(s3);
        lh.add(s4);

        for (Student stu :lh){
            System.out.println(stu.getName());
        }

    }
}

