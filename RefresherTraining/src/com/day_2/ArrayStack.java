package com.day_2;

public class ArrayStack {
	private int arr[];
	private  int top;
	private int size;
	
	public ArrayStack(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
	}
	
	public void push(int value) {
		if(top == size-1) {
			System.out.println("Stack is Overflow");
			return;
		}
		top++;
		arr[top] = value;
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("Stack is underflow");
			return -1;
		}
		int popedValue = arr[top];
		top--;
		return popedValue;
	}
	
	public int peek() {
		return arr[top];
	}
	
	public void print() {
		if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
		for(int i=top; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String args[]) {
		
		ArrayStack s = new ArrayStack(5);
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		int popedValue = s.pop();
		System.out.println("Poped Value is: " + popedValue);
		System.out.println("Peek Element is: " + s.peek());
		s.print();
	}
}
