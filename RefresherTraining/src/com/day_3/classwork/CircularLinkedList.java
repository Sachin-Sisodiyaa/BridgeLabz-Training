package com.day_3.classwork;

public class CircularLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add at beginning
    public void addFirst(int data) {

        Node newNode = new Node(data);

        // Empty list
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        // Find last node
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {

        Node newNode = new Node(data);

        // Empty list
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        // Find last node
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
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

        if (head == null) {
            System.out.println("Position out of range");
            return;
        }

        Node current = head;

        for (int i = 0; i < position - 1; i++) {

            current = current.next;

            // We came back to head
            if (current == head) {
                System.out.println("Position out of range");
                return;
            }
        }

        Node newNode = new Node(data);

        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete first node
    public Node deleteFirst() {

        if (head == null) {
            return null;
        }

        // Only one node
        if (head.next == head) {
            head = null;
            return head;
        }

        Node temp = head;

        // Find last node
        while (temp.next != head) {
            temp = temp.next;
        }

        head = head.next;
        temp.next = head;

        return head;
    }

    // Delete last node
    public Node deleteLast() {

        if (head == null) {
            return null;
        }

        // Only one node
        if (head.next == head) {
            head = null;
            return head;
        }

        Node temp = head;

        // Find second-last node
        while (temp.next.next != head) {
            temp = temp.next;
        }

        temp.next = head;

        return head;
    }

    // Delete at specific position
    public Node deleteAtPosition(int position) {

        if (head == null || position < 0) {
            return head;
        }

        if (position == 0) {
            return deleteFirst();
        }

        Node current = head;

        for (int i = 0; i < position - 1; i++) {

            current = current.next;

            if (current == head) {
                System.out.println("Invalid position");
                return head;
            }
        }

        // If next is head, position does not exist
        if (current.next == head) {
            System.out.println("Invalid position");
            return head;
        }

        current.next = current.next.next;

        return head;
    }

    // Print circular linked list
    public void print() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }

    // Reverse circular linked list
    public void reverse() {

        if (head == null || head.next == head) {
            return;
        }

        Node previous = null;
        Node current = head;
        Node next;

        do {
            next = current.next;

            current.next = previous;

            previous = current;
            current = next;

        } while (current != head);

        head.next = previous;
        head = previous;
    }

    public static void main(String[] args) {

        CircularLinkedList l = new CircularLinkedList();

        l.addFirst(2);
        l.addFirst(1);
        l.addLast(4);
        l.addAtPosition(3, 2);

        System.out.println("Original List:");
        l.print();

        l.reverse();

        System.out.println("After Reverse:");
        l.print();

        l.deleteFirst();
        l.deleteLast();
        l.deleteAtPosition(0);

        System.out.println("After Deletion:");
        l.print();
    }
}
