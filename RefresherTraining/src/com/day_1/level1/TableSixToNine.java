package com.day_1.level1;
import java.util.Scanner;

public class TableSixToNine {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] result = new int[4];

        int index = 0;

        for (int i = 6; i <= 9; i++) {
            result[index++] = num * i;
        }

        index = 0;

        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + result[index++]);
        }
    }
}
