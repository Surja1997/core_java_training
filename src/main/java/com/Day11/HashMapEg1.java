package com.Day11;



import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEg1 {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        map.put("Test","Test2");

        Map<Integer, Student> map1=new HashMap<>();
        map1.put(1,new Student()); //Can put objects as values as well

        LinkedHashMap lh=new LinkedHashMap();
        lh.put("key1","value1");
        lh.put("key2","value2");
        lh.put("key3","value3");
        lh.put("key4","value4");
        lh.put("key5","value5");

        Set<Map.Entry> set=lh.entrySet();
        for(Map.Entry entry: set){
            System.out.println(entry.getKey()+" :  "+entry.getValue());
        }
    }
}
