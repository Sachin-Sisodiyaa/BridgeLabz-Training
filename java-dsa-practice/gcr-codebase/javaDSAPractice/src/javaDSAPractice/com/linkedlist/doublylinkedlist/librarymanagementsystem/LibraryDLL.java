package javaDSAPractice.com.linkedlist.doublylinkedlist.librarymanagementsystem;

class LibraryDLL {

    private BookNode head, tail;

    // Add book at beginning
    void addAtBeginning(int id, String t, String a, String g, boolean av) {
        BookNode n = new BookNode(id, t, a, g, av);
        if (head == null) {
            head = tail = n;
            return;
        }
        n.next = head;
        head.prev = n;
        head = n;
    }

    // Add book at end
    void addAtEnd(int id, String t, String a, String g, boolean av) {
        BookNode n = new BookNode(id, t, a, g, av);
        if (tail == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    // Remove book by ID
    void removeById(int id) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head) head = head.next;
                else if (temp == tail) tail = tail.prev;
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Book removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Search by title or author
    void search(String key) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(key) ||
                temp.author.equalsIgnoreCase(key)) {

                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No matching book found");
    }

    // Update availability
    void updateAvailability(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Display forward
    void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    // Count books
    void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Books: " + count);
    }

    private void printBook(BookNode b) {
        System.out.println(b.bookId + " | " + b.title + " | " +
                           b.author + " | " + b.genre + " | " +
                           (b.available ? "Available" : "Issued"));
    }
}
