/*7. Counting Sort - Sort Student Ages
Problem Statement:
A school collects students’ ages (ranging from 10 to 18) and wants them sorted. Implement Counting Sort for this task.
Hint:
Create a count array to store the frequency of each age.
Compute cumulative frequencies to determine positions.
Place elements in their correct positions in the output array.
*/




package javaDSAPractice.com.algorithms.sortingalgorithms.countingsort;

import java.util.Scanner;

public class CountingSortMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter student ages 10 to 18:");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        CountingSort countingSort = new CountingSort();
        countingSort.sort(ages);

        System.out.println("\nSorted Student Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        sc.close();
    }
}

