package com.day_12.assignment;

public class ReferenceVariableTrap {
	
	int length;
	int width;
	
	public ReferenceVariableTrap(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public ReferenceVariableTrap(ReferenceVariableTrap rect1) {
		this.length = rect1.length;
		this.width = rect1.width;
	}
	
	public void scale(int factor) {
		length *= factor;
		width *= factor;
	}
	
	public static void main(String args[]) {
		ReferenceVariableTrap rect1 = new ReferenceVariableTrap(4, 5);
		ReferenceVariableTrap rect2 = rect1;
		
		System.out.println("Length of Rect1: " + rect1.length + " Width of Rect1: " + rect1.width);
		
		rect2.scale(2);
		
	    System.out.println("Length of Rect1: " + rect1.length + " Width of Rect1: " + rect1.width);
	    
	    ReferenceVariableTrap rect3 = new ReferenceVariableTrap(rect1);
	    System.out.println("Length of Rect3: " + rect3.length + " Width of Rect3: " + rect3.width);
	    
	    rect3.scale(2);
	    
	    System.out.println("Length of Rect1: " + rect1.length + " Width of Rect1: " + rect1.width);
	    
	    System.out.println("Length of Rect3: " + rect3.length + " Width of Rect3: " + rect3.width);
	}
}
