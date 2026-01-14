package com.dayone.bookshelf;

public class Book {
    String title;
    String author;
    String genre;
    String isbn;

    public Book(String title, String author, String genre, String isbn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return title + " (ISBN: " + isbn + ")";
    }
}

