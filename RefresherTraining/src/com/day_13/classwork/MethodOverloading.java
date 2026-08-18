package com.day_13.classwork;

class MethodOverloading{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.add(5,5);
        p.add(5.5, 1.1);
    }
}

class Parent {
     int add(int a, int b){
        System.out.println(a+b);
        return a+b;
     }

     int add(int a, int b, int c){
        System.out.println(a+b+c);
        return a+b+c;
     }
    double add(double a, double b){
        System.out.println(a+b);
        return a+b;
     }     
}

