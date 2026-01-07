/*12. "PetPal – Virtual Pet Care App"
Story: You’re creating PetPal, an app that allows users to adopt and care for virtual pets like
dogs, cats, and birds.
Requirements:
● Pet base class: name, type, age.
● Derived classes: Dog, Cat, Bird (use inheritance).
● IInteractable interface with methods like feed(), play(), sleep().
● Encapsulation of hunger and mood levels.
● Use constructors to assign random default values or user-specified pets.
● Operators to increase/decrease energy, hunger based on interactions.
● Polymorphism: makeSound() behaves differently for each pet.
● Access modifiers ensure internal mood status is only modifiable through methods.*/





package com.dayfour.petpal;

import java.util.Scanner;

public class PetPalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nWelcome to PetPal");
        System.out.println("\nChoose Pet Type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        int choice = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Pet Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Pet Age: ");
        int age = sc.nextInt();
        
        Pet pet;

        if (choice == 1)
            pet = new Dog(name, age);
        else if (choice == 2)
            pet = new Cat(name, age);
        else
            pet = new Bird(name, age);        

        System.out.println("\nPet Adopted Successfully!");
        pet.displayPetDetails();

        pet.makeSound();

        System.out.println("\nChoose Action:");
        System.out.println("1. Feed");
        System.out.println("2. Play");
        System.out.println("3. Sleep");
        int action = sc.nextInt();

        Interactable actionPet = (Interactable) pet;

        if (action == 1)
            actionPet.feed();
        else if (action == 2)
            actionPet.play();
        else
            actionPet.sleep();

        System.out.println("\nPet Status:");
        pet.showStatus();
    }
}
