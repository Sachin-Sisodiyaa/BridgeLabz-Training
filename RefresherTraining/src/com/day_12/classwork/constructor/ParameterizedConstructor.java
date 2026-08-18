package com.day_12.classwork.constructor;

public class ParameterizedConstructor {
	String name;
    int age;
    
    ParameterizedConstructor(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
    
    public void display() {
    	System.out.println("Name: " + name + " Age: "+ age);
    }
    public static void main(String args[]){
    	ParameterizedConstructor p = new ParameterizedConstructor("Sachin", 22);
    	p.display();
    }
    
}
