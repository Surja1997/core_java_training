package com.Day10;

import java.util.*;

public class SetEg1 {

    public static void main(String[] args) {
        Set<Student> stset=new HashSet<>();

        Student s1=new Student(1,"Test1","Hyyd");
        Student s2=new Student(2,"Test2","Blr");
        Student s3=new Student(3,"Test3","Mumbai");
        Student s4=new Student(4,"Test4","Chennai");
        Student s5=new Student(4,"Test4","Chennai");


        stset.add(s1);
        stset.add(s2);
        stset.add(s3);
        stset.add(s4);
        stset.add(s5);//This does not get removed since it has a different hashcode as because new keyword as used

        for(Student st:stset){
            System.out.println("ID: "+st.getId());
        }


    }
}
