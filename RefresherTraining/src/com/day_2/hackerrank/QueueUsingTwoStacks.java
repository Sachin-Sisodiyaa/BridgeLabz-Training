package com.day_2.hackerrank;
import java.util.*;

public class QueueUsingTwoStacks {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
       
        while(q-->0){
            int type = sc.nextInt();
            
            if(type == 1){
                int value = sc.nextInt();
                s1.push(value);
            }
            
            if(type == 2){
                if(s2.isEmpty()){
                    while(!s1.isEmpty()){
                        s2.push(s1.pop());
                    }
                }
                s2.pop();
            }
            
            if(type == 3){
                if(s2.isEmpty()){
                    while(!s1.isEmpty()){
                        s2.push(s1.pop());
                    }
                }
                System.out.println(s2.peek());
            }
        }
    }
}
