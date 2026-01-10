package javaDSAPractice.com.algorithms.searchingalgorithms.linearsearch;

import java.util.Scanner;

public class FirstNegativeLinearSearch {

    static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // first negative found
            }
        }
        return -1; // no negative number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = findFirstNegative(arr);

        if (index != -1) {
            System.out.println("First negative number is at index: " + index);
            System.out.println("Value: " + arr[index]);
        } else {
            System.out.println("No negative number found");
        }

        sc.close();
    }
}
