package com.day7;

import java.io.File;
import java.io.IOException;

public class FileEg {
    public static void main(String[] args) throws IOException {
//        System.out.println("Welcome to files");
//        //Use file api to create a file
//        File file = new File("D:\\practice\\test.txt");
//        System.out.println("File created successfully");
        try {
            File myObj = new File("D:\\practice\\test.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
