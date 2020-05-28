package com.day5;

public class FinalAccessChild extends FinalMethodAccessDemo {
    public static void main(String[] args) {

        FinalAccessDemo fad=new FinalAccessDemo();
        fad.testAB();
        FinalMethodAccessDemo fmd=new FinalAccessChild();
        fmd.test();
        fmd.testAB();

    }
    public void test(){
        System.out.println("in child");
    }
}
