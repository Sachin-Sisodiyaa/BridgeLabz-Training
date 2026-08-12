package com.day_2.classwork;

public class LinkedStack {
	 class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	
	public void push(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	public int pop() {
		if(head == null) {
			System.out.println("UnderFlow");
			return -1;
		}
		int popedVal = head.data;
		head = head.next;
		return popedVal;
	}
	
	public int peek() {
		if(head == null) {
			System.out.println("Stack is Empty");
			return -1;
		}
		
		return head.data;
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Stack is Empty");
		}
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		LinkedStack ls = new LinkedStack();
		
		ls.push(1);
		ls.push(2);
		ls.push(3);
		ls.push(4);
		ls.push(5);
		
		ls.print();
		
		System.out.println("Poped Value: " + ls.pop());
		
		System.out.println("Peek Value: " + ls.peek());
		
		ls.print();
	}
}
