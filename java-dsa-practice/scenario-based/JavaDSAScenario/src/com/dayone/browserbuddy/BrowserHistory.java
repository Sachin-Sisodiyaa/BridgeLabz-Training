package com.dayone.browserbuddy;

class BrowserHistory {

    private Node current;

    // Visit new page
    void visit(String url) {
        Node newNode = new Node(url);

        if (current != null) {
            current.next = null; // clear forward history
            newNode.prev = current;
            current.next = newNode;
        }
        current = newNode;

        System.out.println("Visited: " + url);
    }

    // Back operation
    void back() {
        if (current == null || current.prev == null) {
            System.out.println("No page to go back.");
            return;
        }
        current = current.prev;
        System.out.println("Back to: " + current.url);
    }

    // Forward operation
    void forward() {
        if (current == null || current.next == null) {
            System.out.println("No page to go forward.");
            return;
        }
        current = current.next;
        System.out.println("Forward to: " + current.url);
    }

    String getCurrentPage() {
        return current != null ? current.url : null;
    }
}
