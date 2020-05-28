package com.day7;

import java.io.*;

public class FileReaderEg {
    public static void main(String[] args) throws IOException {
        FileReader f=new FileReader("C:\\practice\\demo2.txt");

        int i=0;
//        System.out.println(fi.read());
        while ((i=f.read())!=-1)
        {
            System.out.print((char)i);
        }

        System.out.println();

        FileWriter fw=new FileWriter("C:\\practice\\demo3.txt");
        fw.write("Welcome to file writer");
        fw.close();

        FileReader f2=new FileReader("C:\\practice\\demo3.txt");

         i=0;
//        System.out.println(fi.read());
        while ((i=f2.read())!=-1)
        {
            System.out.print((char)i);
        }
    }
}
