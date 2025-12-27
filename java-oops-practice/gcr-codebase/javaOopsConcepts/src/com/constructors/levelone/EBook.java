package com.constructors.levelone;

public class EBook extends BookLibrarySystem {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayBookDetails() {
        System.out.println("ISBN   : " + ISBN);        
        System.out.println("Title  : " + title);       
        System.out.println("Author : " + getAuthor()); 
    }
}
