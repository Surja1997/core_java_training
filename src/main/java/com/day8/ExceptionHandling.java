package com.day8;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=1,b=22,c=0;
        try
        {
            System.out.println(b/c);
        }
        catch (Exception e)
        {
            System.out.println("error occured while division "+e);
        }
    }
}
