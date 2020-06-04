package com.Day10;


import java.util.*;

public class SetEg {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();
        s.add("Test1");
        s.add("Testt2");
        s.add("Testt3");
        s.add("Testt4");
        s.add("Testt5");
        s.add("Testt5");

        for(String st : s){ //forEach loop
            System.out.println(st);
        }

        Iterator it =s.iterator();
        while(it.hasNext()){
            System.out.println("Item "+it.next());
        }


    }
}
