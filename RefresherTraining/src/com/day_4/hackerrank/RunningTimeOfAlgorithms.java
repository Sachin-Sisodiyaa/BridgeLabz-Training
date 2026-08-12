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

public class RunningTimeOfAlgorithms {
    static class RunningTimeResult {

    /*
     * Complete the 'runningTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int runningTime(List<Integer> arr) {
        int count = 0;
    // Write your code here
    for(int i=1; i<arr.size(); i++){
        int curr = arr.get(i);
        int prev = i - 1;
        
        
        while(prev >= 0 && arr.get(prev) > curr){
            arr.set(prev + 1, arr.get(prev));
            count++;
            prev--;
        }
        arr.set(prev + 1, curr);
        
    }
    return count;
    }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = RunningTimeResult.runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
