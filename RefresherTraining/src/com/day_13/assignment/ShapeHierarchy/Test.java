package com.day_13.assignment.ShapeHierarchy;
class Test{
	public static void main(String args[]) {
		Shape s1 = new Circle(2);
		Shape s2 = new Rectangle(2,3);
		Shape s3 = new Triangle(4,6);
		
		Shape[]arr = {s1,s2,s3};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].area());
		}
	}
}