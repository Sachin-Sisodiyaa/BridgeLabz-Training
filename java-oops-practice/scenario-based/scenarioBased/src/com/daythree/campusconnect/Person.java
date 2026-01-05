package com.daythree.campusconnect;

abstract class Person {

    protected int id;
    protected String name;
    protected String email;

    // Common constructor for Student & Faculty
    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Polymorphic method
    public abstract void printDetails();
}
