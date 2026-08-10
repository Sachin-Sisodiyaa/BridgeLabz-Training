package com.day_2;
import java.util.*;

public class SimpleTextEditor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        StringBuilder s = new StringBuilder();
        Stack<String> stack = new Stack<>();
        
        int q = sc.nextInt();
        while(q-->0){
            
            int t = sc.nextInt();
            
            if(t == 1){
                stack.push(s.toString());
                String str = sc.next();
                s.append(str);
            }
            else if(t == 2){
                stack.push(s.toString());
                int k = sc.nextInt();
                s.delete(s.length() - k, s.length());
            }
            
            else if(t == 3){
                int k = sc.nextInt();
                System.out.println(s.charAt(k - 1));
            }
            else{
                s = new StringBuilder(stack.pop());
            }
        }
    }
}
