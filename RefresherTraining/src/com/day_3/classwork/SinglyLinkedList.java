package com.day_3.classwork;

public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void addAtPosition(int data, int position) {
	    Node newNode = new Node(data);

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

	    newNode.next = current.next;
	    current.next = newNode;
	}
	
	public Node deleteFirst() {
		if(head == null) {
			return null;
		}
		head = head.next;
		return head;
	}
	
	public Node deleteLast() {
		if(head == null) {
			return null;
		}
		if (head.next == null) {
			head = null;
	        return head;
	    }
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		
		return head;
	}
	
	public Node deleteAtPosition(int position) {
		if(head == null || position < 0) {
			return head;
		}
		if (position == 0) {
	        head = head.next;
	        return head;
	        
	    }
		Node current = head;
		for (int i = 0; i < position - 1 && current != null; i++) {
	        current = current.next;
	    }

	    if (current == null || current.next == null) {
	        System.out.println("Invalid position");
	        return head;
	    }
		current.next = current.next.next;
		return head;
	}
	
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
	public Node reverse() {
		Node prev = null;
		Node current = head;
		while(current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current=next;
		}
		head = prev;
		return head;
		
	}
	
	
	public static void main(String args[]) {
		SinglyLinkedList l = new SinglyLinkedList();
		
		l.addFirst(2);
		l.addFirst(1);
		l.addLast(4);
		l.addAtPosition(3, 2);
		
		l.print();
		l.reverse();
		System.out.println();
		l.print();
		
		l.deleteFirst();
		l.deleteLast();
		l.deleteAtPosition(0);
		System.out.println();
		l.print();
	}
}
