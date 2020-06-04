package com.Day10;

import java.util.*;

public class SortedSetEg {

    public static void main(String[] args) {
        SortedSet<String> st=new TreeSet();

        st.add("Test1");
        st.add("Test3");
        st.add("Test2");
        st.add("Test5");
        st.add("Test4");

        for(String stu:st)
        {
            System.out.println(stu);
        }

        Student s1 = new Student(1, "Test1", "Hyd");
        Student s2 = new Student(2, "Test2", "Blr");
        Student s3 = new Student(3, "Test3", "Mumbai");
        Student s4 = new Student(4, "Test4", "Chennai");

        //This will sort the elements on the basis of id using comparable ,(happens while using treeset
        SortedSet<Student> stset= new TreeSet<>();

        stset.add(s1);
        stset.add(s2);
        stset.add(s3);
        stset.add(s4);

        for (Student s:stset){
            System.out.println(s.getId()+" ,"+s.getName());
        }

        List<Student1> stset1 =new ArrayList<>();
        Student1 st1 = new Student1(1, "Test1", "Hyd");
        Student1 st2 = new Student1(2, "Test3", "Blr");
        Student1 st3 = new Student1(3, "Test2", "Mumbai");
        Student1 st4 = new Student1(4, "Test4", "Chennai");

        stset1.add(st1);
        stset1.add(st2);
        stset1.add(st3);
        stset1.add(st4);

        Collections.sort(stset1,new NameComparator());

        for(Student1 s:stset1){
            System.out.println(s.getName()+" , "+s.getId());
        }


    }
}
