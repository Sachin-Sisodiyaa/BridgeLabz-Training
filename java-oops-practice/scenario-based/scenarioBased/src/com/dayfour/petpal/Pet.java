package com.dayfour.petpal;

public abstract class Pet {

    private String name;
    private String type;
    private int age;

    private int mood;
    private int hunger;
    private int energy;

    // constructor with random default values
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        this.mood = (int) (Math.random() * 50) + 50;
        this.hunger = (int) (Math.random() * 50) + 50;
        this.energy = (int) (Math.random() * 50) + 50;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    // polymorphic method
    public abstract void makeSound();

    // controlled internal changes
    protected void decreaseHunger(int value) {
        hunger = Math.max(0, hunger - value);
    }

    protected void increaseEnergy(int value) {
        energy = Math.min(100, energy + value);
    }

    protected void increaseMood(int value) {
        mood = Math.min(100, mood + value);
    }

    public void displayPetDetails() {
        System.out.println("Pet Name : " + name);
        System.out.println("Pet Type : " + type);
        System.out.println("Pet Age  : " + age);
    }

    public void showStatus() {
        System.out.println("Hunger Level : " + hunger);
        System.out.println("Energy Level : " + energy);
        System.out.println("Mood Level   : " + mood);
    }
}
