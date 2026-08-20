package com.day_15.assignment;

public class Generics {
    
    public static <T> void printArr(T[] arr){
        for(T a : arr){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        
        Integer[] arr = {1,2,3};
        String[] stArr = {"Hello", "World"};

        printArr(arr);
        printArr(stArr);
        
    }
}
