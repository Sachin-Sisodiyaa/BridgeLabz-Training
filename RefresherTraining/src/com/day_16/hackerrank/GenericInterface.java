package com.day_16.hackerrank;

import java.util.Scanner;

interface AdvancedArithmetic {

    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}

public class GenericInterface {

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
