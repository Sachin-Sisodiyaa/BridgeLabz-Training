package com.day_3.hackerrank;

public class InsertAtTail {
    static class InsertTailNode {
        int data;
        InsertTailNode next;

        InsertTailNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

	static InsertTailNode insertNodeAtTail(InsertTailNode head, int data) {
        InsertTailNode newNode = new InsertTailNode(data);

        if (head == null) {
            return newNode;
        }

        InsertTailNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static void printLinkedList(InsertTailNode head) {
        InsertTailNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        InsertTailNode head = null;

        // Insert nodes at the tail
        head = insertNodeAtTail(head, 10);
        head = insertNodeAtTail(head, 20);
        head = insertNodeAtTail(head, 30);
        head = insertNodeAtTail(head, 40);
        head = insertNodeAtTail(head, 50);
        head = insertNodeAtTail(head, 60);

        // Print the linked list
        System.out.println("Linked List:");
        printLinkedList(head);
    }
}
