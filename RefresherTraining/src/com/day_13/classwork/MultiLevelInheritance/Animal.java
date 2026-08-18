package com.day_13.classwork.MultiLevelInheritance;
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class GermanShepherd extends Dog {
    void guard() {
        System.out.println("German Shepherd guards");
    }
}