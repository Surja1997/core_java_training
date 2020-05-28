package com.day2;
import com.day1.hello;

public class ExtendsAbstract extends DemoAbstract{

    public boolean b1;

    public static void main(String[] args) {
        DemoAbstract da = new ExtendsAbstract(); // I have a doubt in this
        da.display();
        da.show();
        da.print(26);


    }

    @Override
    public void show() {
        boolean bool = true;
        System.out.println(b1);
        System.out.println(bool);

    }

    @Override
    public void print(int a) {
        System.out.println("in extends abstract : "+a);

    }

}
