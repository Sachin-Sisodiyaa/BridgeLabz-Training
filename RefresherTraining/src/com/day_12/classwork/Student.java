package com.day_12.classwork;

public class Student{
    String name;
    int age;
    int rollNumber;
    String address;
    static String schoolName = "ABC School";

    public void display(){
        System.out.println("Name: " + name + " age: " + age + " roll number: " + rollNumber + " Address: " + address + " School Name: " + schoolName);
    }

}

