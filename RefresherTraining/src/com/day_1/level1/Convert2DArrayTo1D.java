package com.day_1.level1;
import java.util.Scanner;

public class Convert2DArrayTo1D {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = sc.nextInt();

        System.out.print("Columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] arr = new int[rows * cols];

        int index = 0;

        System.out.println("Enter Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                arr[index++] = matrix[i][j];
            }
        }

        System.out.println("1D Array:");

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
