package com.day_3;

public class InsertAtTail {
	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null) {
            return newNode;
        }

        SinglyLinkedListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        SinglyLinkedListNode head = null;

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

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
