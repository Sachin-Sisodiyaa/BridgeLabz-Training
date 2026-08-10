package com.day_3;

public class InsertNodeAtHead {
	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = llist;
        llist = newNode;
        return newNode;
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

        // Insert nodes at the head
        head = insertNodeAtHead(head, 10);
        head = insertNodeAtHead(head, 20);
        head = insertNodeAtHead(head, 30);
        head = insertNodeAtHead(head, 50);

        // Print the linked list
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
