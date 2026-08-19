package com.day_14.assignment.AbstractClass2;

public abstract class Book {

    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    abstract void display();
}