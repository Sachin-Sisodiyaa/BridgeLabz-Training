package com.dayfour.petpal;

public class Bird extends Pet implements Interactable {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird says: Tweet Tweet!");
    }

    public void feed() {
        decreaseHunger(10);
        increaseMood(10);
        System.out.println("Bird enjoyed seeds!");
    }

    public void play() {
        increaseMood(20);
        System.out.println("Bird is flying around!");
    }

    public void sleep() {
        increaseEnergy(20);
        System.out.println("Bird is resting.");
    }
}
