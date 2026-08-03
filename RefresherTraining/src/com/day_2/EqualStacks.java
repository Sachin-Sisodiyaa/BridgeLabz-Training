package com.day_2;
import java.util.*;

public class EqualStacks {
	
	public static int getSum(List<Integer> list) {
        int sum = 0;
        for (int x : list)
            sum += x;
        return sum;
    }

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    // Write your code here
    int sumh1 = getSum(h1);
    int sumh2 = getSum(h2);
    int sumh3 = getSum(h3);

    while(true){
        if(sumh1 == sumh2 && sumh1 == sumh3)
            return sumh1;
            
        else if(h1.isEmpty() || h2.isEmpty() || h3.isEmpty()){
            return 0;
        }
        
        else{
            if(sumh1 >= sumh2 && sumh1 >= sumh3)
                sumh1 -= h1.remove(0);
            else if(sumh2 >= sumh1 && sumh2 >= sumh3)
                sumh2 -= h2.remove(0);
            else
                sumh3 -= h3.remove(0);
        }
    }

  }
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Stack 1: ");
        int n1 = sc.nextInt();

        System.out.print("Enter size of Stack 2: ");
        int n2 = sc.nextInt();

        System.out.print("Enter size of Stack 3: ");
        int n3 = sc.nextInt();

        List<Integer> h1 = new ArrayList<>();
        List<Integer> h2 = new ArrayList<>();
        List<Integer> h3 = new ArrayList<>();

        System.out.println("Enter elements of Stack 1 (top to bottom):");
        for (int i = 0; i < n1; i++) {
            h1.add(sc.nextInt());
        }

        System.out.println("Enter elements of Stack 2 (top to bottom):");
        for (int i = 0; i < n2; i++) {
            h2.add(sc.nextInt());
        }

        System.out.println("Enter elements of Stack 3 (top to bottom):");
        for (int i = 0; i < n3; i++) {
            h3.add(sc.nextInt());
        }

        int ans = equalStacks(h1, h2, h3);

        System.out.println("Maximum Equal Height = " + ans);

        sc.close();
    }
}
