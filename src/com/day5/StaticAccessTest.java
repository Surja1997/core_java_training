package com.day5;

public class StaticAccessTest {
    public static void main(String[] args) {
        System.out.println("Name: "+StaticAccessDemo.name);//static variables are beter accessed through direct class. You don't need to instantiate another variable

        StaticAccessDemo sad =new StaticAccessDemo();
        System.out.println("a: "+sad.a);
        System.out.println("name: "+sad.name);//rather than this

//        System.out.println(StaticAccessDemo.show(););

    }
}
