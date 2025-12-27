package com.constructors.levelone;

public class BookMain {
	public static void main(String[] args) {

        // Using default constructor
        Book b1 = new Book();
        System.out.println(b1.getTitle() + ", " + b1.getAuthor() + ", " + b1.getPrice());

        // Using parameterized constructor
        Book b2 = new Book("Java Programming", "James Gosling", 499.0f);
        System.out.println(b2.getTitle() + ", " + b2.getAuthor() + ", " + b2.getPrice());
    }
}
