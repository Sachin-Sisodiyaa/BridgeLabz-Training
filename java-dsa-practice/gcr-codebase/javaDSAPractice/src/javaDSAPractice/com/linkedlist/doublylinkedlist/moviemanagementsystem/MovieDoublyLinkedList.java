package javaDSAPractice.com.linkedlist.doublylinkedlist.moviemanagementsystem;

class MovieDoublyLinkedList {

    private MovieNode head, tail;

    // Add movie at beginning
    void addAtBeginning(String t, String d, int y, double r) {
        MovieNode n = new MovieNode(t, d, y, r);

        if (head == null) {
            head = tail = n;
            return;
        }
        n.next = head;
        head.prev = n;
        head = n;
    }

    // Add movie at end
    void addAtEnd(String t, String d, int y, double r) {
        MovieNode n = new MovieNode(t, d, y, r);

        if (tail == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    // Remove movie by title
    void removeByTitle(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp == head) head = head.next;
                else if (temp == tail) tail = tail.prev;
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Movie removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // Display movies forward
    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println("Movie title: " + temp.title + " | " + "Movie Director: " + temp.director + " | " +
                               "Movie release year: " + temp.year + " | " + " Movie rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Display movies in reverse
    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " +
                               temp.year + " | " + temp.rating);
            temp = temp.prev;
        }
    }
}

