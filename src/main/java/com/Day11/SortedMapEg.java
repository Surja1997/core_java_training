package com.Day11;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapEg {
    public static void main(String[] args) {

        System.out.println("After sorting keys");
        SortedMap sm=new TreeMap();
        sm.put("key1","value1");
        sm.put("key5","value2");
        sm.put("key2","value3");
        sm.put("key3","value4");

        sm.put("key4","value5");

        Set<Map.Entry> smset=sm.entrySet();
        for(Map.Entry entry: smset){
            System.out.println(entry.getKey()+" :  "+entry.getValue());
        }


    }
}
