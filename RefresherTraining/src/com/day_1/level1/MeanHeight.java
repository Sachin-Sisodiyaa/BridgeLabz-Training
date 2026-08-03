package com.day_1.level1;
import java.util.Scanner;

public class MeanHeight {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] height = new double[11];
        double sum = 0;

        for (int i = 0; i < height.length; i++) {
            System.out.print("Enter height: ");
            height[i] = sc.nextDouble();
            sum += height[i];
        }

        double mean = sum / height.length;

        System.out.println("Mean Height = " + mean);
    }
}
