package com.daythree.campusconnect;

class Faculty extends Person {

    private String department;

    public Faculty(int id, String name, String email, String dept) {
        super(id, name, email);
        department = dept;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printDetails() {
        System.out.println("Faculty: " + name + ", Department: " + department);
    }
}
