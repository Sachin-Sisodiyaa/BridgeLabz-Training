package com.day_15.classwork;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

interface Flyable {
    void fly();
}

interface Swimable{
	void swim();
}

class Bird extends Animal implements Flyable, Swimable{

    @Override
    public void fly() {
        System.out.println("Bird flies");
    }
    
    @Override
    public void swim() {
    	System.out.println("Duck is a bird that can both swim & fly.");
    }

    void sing() {
        System.out.println("Bird sings");
    }
}

public class Main {
    public static void main(String[] args) {

        Bird b = new Bird();

        b.eat();    
        b.fly();    
        b.sing(); 
        b.swim();
    }
}