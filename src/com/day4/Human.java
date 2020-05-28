package com.day4;

public class Human extends Animal{
    private String mobile;
    private String address;

    public Human(int age, String name, int height, String mobile, String address) {
        super(age, name, height); //invokes const in parent class
        this.mobile = mobile;
        this.address = address;
        System.out.println(this.name+", "+"this.age is not available and instead we can do: "+getAge()+", "+this.height);//age is not accessible here
        display(name);
    }
    public void print(){
        display("Human");
    }
    public void display(){//Compile time polymorphysm , method overriding
        System.out.println("In Human");
    }
    public void display(String name)
    {
        System.out.println("In human, name is "+name);
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
