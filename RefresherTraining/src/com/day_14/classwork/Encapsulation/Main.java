package com.day_14.classwork.Encapsulation;

public class Main {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Sachin");
        s.setAge(21);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}