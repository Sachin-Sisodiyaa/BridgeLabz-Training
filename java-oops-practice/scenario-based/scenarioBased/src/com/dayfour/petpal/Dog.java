package com.dayfour.petpal;

public class Dog extends Pet implements Interactable {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }

    public void feed() {
        decreaseHunger(20);
        increaseMood(10);
        System.out.println("Dog enjoyed the food!");
    }

    public void play() {
        increaseMood(20);
        System.out.println("Dog is happily playing!");
    }

    public void sleep() {
        increaseEnergy(30);
        System.out.println("Dog is sleeping peacefully.");
    }
}
