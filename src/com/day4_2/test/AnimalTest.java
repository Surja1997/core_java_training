package com.day4_2.test;

import com.day4.Animal;//Had the class been default, we could not have been able to import it.
import com.day4.Dog;
import com.day4.Human;

public class AnimalTest {
    public static void main(String[] args) {
        Animal an=new Animal();//default constructor
        //no data members are available from the Animal class since there are no public members
        an.display("animal");//animal display display
        an.display("animal",10,90);

        Human hn=new Human(15,"human",170,"321312115","xyz");
        hn.display("override");//Animal member display when the method is commented out in human, otherwise human methid
        hn.getMobile();
        display(hn);

        Animal hn2=new Human(15,"human",170,"321312115","xyz");
        hn2.display("override with human");//animal member display when the method is commented out in human, otherwise human methid


        Animal dg=new Dog();
        display(dg);

    }

    public static void display(Animal animal){

        System.out.println(animal.getAge()+", "+animal.getName());
    }
    public static void display(Human human){

        System.out.println(human.getMobile()+", "+human.getAddress());
    }

}
