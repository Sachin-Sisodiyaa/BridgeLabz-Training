package com.day_5.hackerrank;
import java.io.*;
import java.util.*;

public class QuickSort2 {
    
    public static void quickSort(int[] arr, int si, int ei) {

        if (si >= ei)
            return;

        int pivot = arr[si];

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        for (int i = si + 1; i <= ei; i++) {
            if (arr[i] < pivot)
                left.add(arr[i]);
            else
                right.add(arr[i]);
        }

        int index = si;

        for (int x : left)
            arr[index++] = x;

        int pivotIndex = index;
        arr[index++] = pivot;

        for (int x : right)
            arr[index++] = x;

        quickSort(arr, si, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, ei);

        for (int i = si; i <= ei; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, arr.length-1);
    }
}