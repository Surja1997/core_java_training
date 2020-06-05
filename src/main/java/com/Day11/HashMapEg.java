package com.Day11;

import java.util.*;

public class HashMapEg {
    public static void main(String[] args) {
        Map m=new HashMap();

        m.put("key1","value1");
        m.put("key2","value2");
        m.put("key3","value3");
        m.put("key4","value4");
        m.put("key5","value5");

        System.out.println(m.get("key2"));

        //Iterating a hashmap
        Set<Map.Entry> set=m.entrySet();
        for (Map.Entry entry: set){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("Using iterator");
        //Method2
        Iterator it=m.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry=(Map.Entry)it.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        //printing keys

        System.out.println("Printing keys");
        Set<String> keys =m.keySet();
        for(String st : keys){
            System.out.println(st);
        }

        //printing values

//        System.out.println("Printing values");
//        Set<String> values =m.;
//        for(String st : values){
//            System.out.println(st);
//        }




    }
}
