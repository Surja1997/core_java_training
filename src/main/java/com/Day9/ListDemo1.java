package com.Day9;

import java.util.*;

import static com.Day9.ListDemo.printList;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Surjashish");
        myList.add("Sengupta");
        myList.add("Hiya");
        myList.add("ShreeDatree");

//        printList(myList);

        System.out.println("Using For each");
        for(String st : myList){
//            myList.remove(0);
            System.out.println("Items : "+st);
        }

        System.out.println("Using iterator" );

        Iterator it = myList.iterator();
        while (it.hasNext())
        {
            if(it.next().equals("Hiya")){
                it.remove();
            }
        }
        printList(myList);//Notice that Hiya has been removed
    }
}
