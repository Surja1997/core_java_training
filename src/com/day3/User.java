package com.day3;

public class User {
    public int age,height;
    public User(){  //constructor
        this(25,170);
        height=175;
        System.out.println("In constructor, Age: "+age+" Height: "+height);

    }

    public User(int age) {
        this.age = age;
        System.out.println("In parameterized constructor 1.0, age="+age+","+height);
    }

    public User(int age, int height) {
        this.age = age;
        this.height = height;
        System.out.println("in param const 2.0 "+age+"height: "+height);
    }
}
