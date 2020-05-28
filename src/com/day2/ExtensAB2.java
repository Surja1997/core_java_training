package com.day2;

public class ExtensAB2 extends ExtendsAbstract {

    public void print(int a){
        System.out.println("in AB2: "+a);
    }

    public static void main(String[] args) {
        DemoAbstract da;
        da = new ExtendsAbstract();
        da.display();
        da.show();
        ExtendsAbstract da2=new ExtensAB2();
        da2.print(25);

        ExtendsAbstract da3=new ExtendsAbstract();
        da3.print(25);
    }
}
