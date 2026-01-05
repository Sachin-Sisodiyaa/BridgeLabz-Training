package javaDSAPractice.com.linkedlist.doublylinkedlist.moviemanagementsystem;

class MovieNode {
    String title, director;
    int year;
    double rating;

    MovieNode prev, next;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

