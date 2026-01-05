package javaDSAPractice.com.linkedlist.doublylinkedlist.librarymanagementsystem;

class BookNode {
    int bookId;
    String title, author, genre;
    boolean available;

    BookNode prev, next;

    BookNode(int id, String t, String a, String g, boolean av) {
        bookId = id;
        title = t;
        author = a;
        genre = g;
        available = av;
    }
}
