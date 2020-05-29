package com.day7;

import java.io.*;

public class FileInputStreamEg {
    public static void main(String[] args) throws IOException {
        FileInputStream f1=new FileInputStream("C:\\practice\\demo.txt");
//        String s=(String)f1.read();
        String st="";
        int i=0;
        System.out.println(f1.read());
        while ((i=f1.read())!=-1)
        {
            System.out.print((char)i);
        }
        System.out.println();
        System.out.println("File read successfully");
    }
}
