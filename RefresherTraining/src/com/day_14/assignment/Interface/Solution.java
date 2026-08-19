package com.day_14.assignment.Interface;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        MyCalculator calculator = new MyCalculator();

        System.out.println(
            "I implemented: " +
            calculator.getClass()
                      .getInterfaces()[0]
                      .getSimpleName()
        );

        System.out.println(calculator.divisor_sum(n));

        scan.close();
    }
}