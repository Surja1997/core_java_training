package com.Day9;

import java.util.*;

public class ListDemo {
    public static void printList(List list)
    {
        for (int i=0;i<list.size();i++)
        {
            System.out.println("index: "+i+" value: "+list.get(i));
        }
    }


    public static void main(String[] args) {



        List l=new ArrayList();//First Element has an index of 0
        l.add("Surja");
        l.add(10);
        l.add('A');
        l.add(5.0);
        l.add("Java");

//        System.out.println(l.get(3));

        l.add(3,'b');
//        System.out.println(l.get(3));

        List l1=new ArrayList();
        l1.add("Java 1");
        l1.add("Sengupta");
        l1.add("Java 1");
        l1.add("Java 1");
        l1.add("Java 1");
        //Creating a method for printing the list



        //Iterating the list

        for(int i=0;i<l.size();i++)
        {
            System.out.println(i+" "+l.get(i));
        }

        l.addAll(l1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for(int i=0;i<l.size();i++)
        {
            System.out.println(i+" "+l.get(i));
        }

//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        l.clear();
//        for(int i=0;i<l.size();i++)
//        {
//            System.out.println(i+" "+l.get(i));
//        }
        boolean flag =l.contains("Java 1");
        System.out.println("Is Java 1 present? "+flag);

        System.out.println("Is collection empty? "+l.isEmpty());

        System.out.println("First index of Java 1 "+l.indexOf("Java 1"));
        System.out.println("Last index og Java 1 "+l.lastIndexOf("Java 1"));

        //removing a particular index
        l.remove(10);
        printList(l);

        //removing a particular element
        l.remove("Java");


    }
}
