package com.day_16.classwork;

interface Container<T>{
	void add(T item);
	T getItem();
}
class GenericInterface<T> implements Container<T>{
	T item;
	@Override
	public void add(T item) {
		this.item = item;
		
	}

	@Override
	public T getItem() {
		return item;
	}
	
	
	public static void main(String args[]) {
		
		GenericInterface<Integer> i = new GenericInterface<>();
		i.add(5);
		System.out.println(i.getItem());
		GenericInterface<String> s = new GenericInterface<>();
		s.add("hello");
		System.out.println(s.getItem());
	}
}
