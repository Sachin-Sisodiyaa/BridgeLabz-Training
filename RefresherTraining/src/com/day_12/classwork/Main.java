package com.day_12.classwork;

public class Main {
    public static void main(String args[]){

        Student s1 = new Student();
        s1.name = "Tom";
        s1.age = 22;
        s1.rollNumber = 148;
        s1.address = "Bhopal";
        s1.display();

        Student s2 = new Student();
        s2.name = "Jerry";
        s2.age = 20;
        s2.rollNumber = 207;
        s2.address = "Indore";
        s2.display();
    }
}
