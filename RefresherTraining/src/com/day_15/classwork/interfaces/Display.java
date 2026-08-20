package com.day_15.classwork.interfaces;

public class Display implements Interface2{
	@Override
	public void show() {
		System.out.println("Interface 1 show method");
	}
	@Override
	public void print() {
		System.out.println("Interface 2 print method");
	}
	
	
	public static void main(String args[]) {
		Display d = new Display();
		d.show();
		d.print();
	}

}
