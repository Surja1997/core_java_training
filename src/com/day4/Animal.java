package com.day4;

public class Animal {
    private int age;//class
    String name;//package
    protected int height;//package+inheritance

    public Animal(int age, String name, int height) {
        this();
        this.age = age;
        this.name = name;
        this.height = height;
        System.out.println("age "+age+" name "+name+" height "+height);
    }

    public Animal(){
        System.out.println("Animal Obj created");
    }
    public void display(String name){
        System.out.println("In the Animal display method   "+name);

    }
    public void display(String name,int age,int height){ //compile time polymorphysm as it is onlly executed in compile time
        System.out.println("In the Animal display method   "+name +", "+age+", "+height);

    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
