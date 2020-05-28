package com.mohor;
import com.day1.hello;
public class samplePrg{

    public static String name="Surjashish Sengupta";
    public static void main(String[] args){
        System.out.println("Welcome to java");
        displayText();
        hello app=new hello();
        hello app2=new hello();
        app2.display2();
        app.display();

    }

    public static void displayText()
    {
        System.out.println("Welcome "+name);
    }
}