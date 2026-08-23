package com.day_16.hackerrank;
import java.util.*;

public class StaticInitializer {
    
        static int B;
        static int H;
        static boolean check = true;
        
        static {
            Scanner sc = new Scanner(System.in);
            B = sc.nextInt();
            H = sc.nextInt();
            
            if(B <= 0 || H <= 0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                check = false;
            }
        }

    public static void main(String[] args) {
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        if(check){
            System.out.println(B*H);
        }              
    }
}