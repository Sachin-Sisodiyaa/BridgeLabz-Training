package com.day_3.hackerrank;

public class InsertNodeAtHead {
    static class InsertHeadNode {
        int data;
        InsertHeadNode next;

        InsertHeadNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

	static InsertHeadNode insertNodeAtHead(InsertHeadNode llist, int data) {
        InsertHeadNode newNode = new InsertHeadNode(data);
        newNode.next = llist;
        llist = newNode;
        return newNode;
    }

    static void printLinkedList(InsertHeadNode head) {
        InsertHeadNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        InsertHeadNode head = null;

        // Insert nodes at the head
        head = insertNodeAtHead(head, 10);
        head = insertNodeAtHead(head, 20);
        head = insertNodeAtHead(head, 30);
        head = insertNodeAtHead(head, 50);

        // Print the linked list
        printLinkedList(head);
    }
}
