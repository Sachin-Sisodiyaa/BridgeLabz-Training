package com.day_12.classwork.constructor;

public class NonparameterizedConstructor {
	String name;
    int age;
    
    NonparameterizedConstructor() {
    	System.out.println("Non parameterized Constructor Called.");
    }
    public static void main(String args[]){
    	NonparameterizedConstructor m = new NonparameterizedConstructor();
    }
    
}
