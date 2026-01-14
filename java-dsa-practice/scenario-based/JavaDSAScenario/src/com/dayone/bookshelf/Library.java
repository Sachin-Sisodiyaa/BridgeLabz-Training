package com.dayone.bookshelf;

import java.util.*;

public class Library {

    private HashMap<String, HashMap<String, LinkedList<Book>>> catalog = new HashMap<>();
    private HashSet<String> isbnSet = new HashSet<>();

    // Add Book
    public void addBook(Book book) {

        if (isbnSet.contains(book.isbn)) {
            System.out.println("Duplicate book not allowed.");
            return;
        }

        catalog.putIfAbsent(book.genre, new HashMap<>());
        catalog.get(book.genre).putIfAbsent(book.author, new LinkedList<>());
        catalog.get(book.genre).get(book.author).add(book);

        isbnSet.add(book.isbn);
        System.out.println("Book added successfully.");
    }

    // Remove Book (Borrow)
    public void removeBook(String isbn) {

        for (String genre : catalog.keySet()) {
            for (String author : catalog.get(genre).keySet()) {

                Iterator<Book> it = catalog.get(genre).get(author).iterator();
                while (it.hasNext()) {
                    Book b = it.next();
                    if (b.isbn.equals(isbn)) {
                        it.remove();
                        isbnSet.remove(isbn);
                        System.out.println("Book borrowed/removed.");
                        return;
                    }
                }
            }
        }
        System.out.println("Book not found.");
    }

    // Show Books by Genre
    public void showByGenre(String genre) {

        if (!catalog.containsKey(genre)) {
            System.out.println("No such genre.");
            return;
        }

        System.out.println("\n📚 Genre: " + genre);
        for (String author : catalog.get(genre).keySet()) {
            System.out.println(" Author: " + author);
            for (Book b : catalog.get(genre).get(author)) {
                System.out.println("   - " + b);
            }
        }
    }
}
