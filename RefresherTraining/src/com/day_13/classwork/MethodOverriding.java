package com.day_13.classwork;

class MethodOverriding{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        Animal c= new Cat();
        c.sound();
    }
}

class Animal {

    void sound(){
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog sounds");
    }
    
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat sounds");
    }
    
}

