package com.day_4.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class InsertionSort2 {
    static class InsertionSort2Result {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void printArray(List<Integer> arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void insertionSort2(int n, List<Integer> arr) {
    // Write your code here
    for(int i=1; i<n; i++){
        int curr = arr.get(i);
        int prev = i - 1;
        
        while(prev >= 0 && arr.get(prev) > curr){
            arr.set(prev + 1, arr.get(prev));
            prev--;
        }
        arr.set(prev + 1, curr);
        printArray(arr);
    }
    
    }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        InsertionSort2Result.insertionSort2(n, arr);

        bufferedReader.close();
    }
}
