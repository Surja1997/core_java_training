package com.day7;

import java.io.*;

public class BufferOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1=new FileOutputStream("C:\\practice\\demo2.txt");
        BufferedOutputStream b0=new BufferedOutputStream(f1);

        f1.write("Welcome to Buffered stream".getBytes());
        f1.close();

        FileInputStream fi=new FileInputStream("C:\\practice\\demo2.txt");
        BufferedInputStream bi= new BufferedInputStream(fi);
        bi.read();



        int i=0;
//        System.out.println(fi.read());
        while ((i=bi.read())!=-1)
        {
            System.out.print((char)i);
        }
        System.out.println();
        System.out.println("File read successfully");

    }
}
