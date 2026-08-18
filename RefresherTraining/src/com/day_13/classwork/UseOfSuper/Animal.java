package com.day_13.classwork.UseOfSuper;
class Animal {
     
     int x=10;

    public Animal(){
        System.out.println("Parent class constructor");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{

    int x=5;

    public Dog(){
        super();
        System.out.println("Child class constructor");
    }
    void v(){
       System.out.println(super.x); 
    }
    void barks(){
        System.out.println("Dog Barks");
    }
    
}
