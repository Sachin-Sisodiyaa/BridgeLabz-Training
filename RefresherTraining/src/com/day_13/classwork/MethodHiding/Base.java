package com.day_13.classwork.MethodHiding;

class Animal {

    static void sound(){
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal{
    static void sound(){
        System.out.println("Dog sounds");
    }
    
}
class Cat extends Animal{
    static void sound(){
        System.out.println("Cat sounds");
    }
    
}
