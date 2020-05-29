package com.day8;

public class ThrowEx {
    public static void main(String[] args) {
        Display d=new Display();
        try{
            d.display();
        }
        catch (Exception e)
        {
            System.out.println("Exception caught successfully "+e);
        }
        finally {
            System.out.println("In the finally block");
        }
    }
}
