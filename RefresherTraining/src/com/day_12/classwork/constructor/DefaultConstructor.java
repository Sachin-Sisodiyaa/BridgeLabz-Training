package com.day_12.classwork.constructor;

public class DefaultConstructor {
    String name;
    int age;
    //Default Constructor will be called by java and initialise default values to our instance variables bcz we will not create constructor by self.
    public static void main(String args[]){
        DefaultConstructor m = new DefaultConstructor();
        System.out.println(m.name);
        System.out.println(m.age);
    }
}
