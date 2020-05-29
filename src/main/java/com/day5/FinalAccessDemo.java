package com.day5;

public final class FinalAccessDemo {

    private final int a=30;
    private int b;

    public final void testAB(){

        final int ab =  90;
        b=28;
        System.out.println("total: "+a+b+ab);//concatenates
        System.out.println(a+b+ab);//adds

    }
    public static void test2(){
        final int d=40;
        System.out.println("d : "+d);
    }
}
