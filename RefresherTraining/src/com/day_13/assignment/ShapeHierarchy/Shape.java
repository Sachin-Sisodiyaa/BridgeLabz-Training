package com.day_13.assignment.ShapeHierarchy;

class Shape {
	
	public double  area() {
		return 0;
	}
}

class Circle extends Shape{
	
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double  area() {
		double pi = 3.14;
		return pi*radius*radius;
	}
}

class Rectangle extends Shape{
	
	int length;
	int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public double  area(){
        return length*width;
	}
}

class Triangle extends Shape{
	
	int base;
	int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public double  area() {
		return  0.5*(base*height);
	}
}

