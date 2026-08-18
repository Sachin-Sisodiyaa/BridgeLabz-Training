package com.day_12.classwork.constructor;

public class CopyConstructor {
	
	int length;
	int width;
	
	public CopyConstructor(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public CopyConstructor(CopyConstructor rect1) {
		this.length = rect1.length;
		this.width = rect1.width;
	}
		
	public static void main(String args[]) {
		CopyConstructor rect1 = new CopyConstructor(4, 5);
		
		System.out.println("Length of Rect1: " + rect1.length + " Width of Rect1: " + rect1.width);
		rect1.length = 10;
		
	    CopyConstructor rect2 = new CopyConstructor(rect1);
	    System.out.println("Length of Rect2: " + rect2.length + " Width of Rect2: " + rect2.width);	    
	}
}
