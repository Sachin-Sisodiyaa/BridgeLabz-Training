package com.day_12.classwork.constructor;
class ConstructorOverloading {

    String name;
    int age;

    ConstructorOverloading() {
        name = "Unknown";
        age = 0;
    }

    ConstructorOverloading(String name) {
        this.name = name;
        age = 0;
    }

    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        ConstructorOverloading s1 = new ConstructorOverloading();
        ConstructorOverloading s2 = new ConstructorOverloading("Sachin");
        ConstructorOverloading s3 = new ConstructorOverloading("Rahul", 22);

        s1.display();
        s2.display();
        s3.display();
    }
}