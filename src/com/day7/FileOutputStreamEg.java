package com.day7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEg {
    public static void main(String[] args)throws IOException {
        FileOutputStream fo=new FileOutputStream("C:\\practice\\demo.txt");
        String st="Welcome to File output stream";

        fo.write(st.getBytes());
        fo.close();
        System.out.println("File has been successfully created");

    }
}
