package com.dayfour.petpal;

public class Cat extends Pet implements Interactable {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }

    public void feed() {
        decreaseHunger(15);
        increaseMood(10);
        System.out.println("Cat enjoyed the meal!");
    }

    public void play() {
        increaseMood(15);
        System.out.println("Cat is playing lazily.");
    }

    public void sleep() {
        increaseEnergy(25);
        System.out.println("Cat is sleeping.");
    }
}
