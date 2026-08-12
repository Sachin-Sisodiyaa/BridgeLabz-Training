package com.day_3.classwork;

public class DoublyLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Add at specific position
    public void addAtPosition(int data, int position) {

        if (position < 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 0) {
            addFirst(data);
            return;
        }

        Node current = head;

        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of range");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;
    }

    // Delete first node
    public Node deleteFirst() {

        if (head == null) {
            return null;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        return head;
    }

    // Delete last node
    public Node deleteLast() {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            head = null;
            return head;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;

        return head;
    }

    // Delete node at specific position
    public Node deleteAtPosition(int position) {

        if (head == null || position < 0) {
            return head;
        }

        if (position == 0) {
            return deleteFirst();
        }

        Node current = head;

        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position");
            return head;
        }

        // Connect previous node to next node
        if (current.prev != null) {
            current.prev.next = current.next;
        }

        // Connect next node to previous node
        if (current.next != null) {
            current.next.prev = current.prev;
        }

        return head;
    }

    // Print from head to tail
    public void print() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }

        System.out.print("null");
    }

    // Reverse doubly linked list
    public Node reverse() {

        Node current = head;
        Node temp = null;

        while (current != null) {

            // Swap prev and next
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to next node
            current = current.prev;
        }

        // Update head
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }

    public static void main(String args[]) {

        DoublyLinkedList l = new DoublyLinkedList();

        l.addFirst(2);
        l.addFirst(1);
        l.addLast(4);
        l.addAtPosition(3, 2);

        System.out.println("Original List:");
        l.print();

        l.reverse();

        System.out.println("\nAfter Reverse:");
        l.print();

        l.deleteFirst();
        l.deleteLast();
        l.deleteAtPosition(0);

        System.out.println("\nAfter Deletion:");
        l.print();
    }
}
