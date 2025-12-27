package com.constructors.levelone;

public class PersonMain {
	// Main method for testing
    public static void main(String[] args) {

        Person p1 = new Person("Sachin", 22);
        Person p2 = new Person(p1);   // cloning p1

        System.out.println("Original Person:");
        p1.display();

        System.out.println("\nCloned Person:");
        p2.display();
    }
}
