package com.day_2.classwork;
import java.util.Stack;

public class StackMethods {
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<>();
		if(s.isEmpty()) {
			System.out.println("Stack is Empty");
		}
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(s);
		
		int popedValue = s.pop();
		System.out.println(popedValue);
		
		System.out.println(s);
		System.out.println(s.peek());
		
	}
}
