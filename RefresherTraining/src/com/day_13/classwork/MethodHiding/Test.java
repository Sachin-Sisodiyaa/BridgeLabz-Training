package com.day_13.classwork.MethodHiding;

class Test{
	
    public static void main(String[] args) {
    	Cat c = new Cat();
        c.sound();
        Animal a = new Cat();
        a.sound();
        
    }
}