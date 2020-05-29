package com.day6;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] num;
        num=new int[20];
        System.out.println("Welcome to Arrays  "+num[1]);

        for (int i=0;i<num.length;i++)
        {
            num[i]=i;
        }
        for (int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}
