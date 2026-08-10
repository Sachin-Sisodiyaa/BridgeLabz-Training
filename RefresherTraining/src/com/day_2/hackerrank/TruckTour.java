package com.day_2;
import java.util.*;

public class TruckTour {
	public static int truckTour(List<List<Integer>> petrolpumps) {
	    // Write your code here
	    int start = 0;
	    int balance = 0;
	    int deficit = 0;
	    
	    for(int i=0 ; i<petrolpumps.size(); i++){
	        int petrol = petrolpumps.get(i).get(0);
	        int distance = petrolpumps.get(i).get(1);
	        
	        balance += petrol - distance;
	        
	        if(balance < 0){
	            deficit += balance;
	            start = i + 1;
	            balance = 0;
	        }
	    }
	    
	    return start;

	    }
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of petrol pumps: ");
        int n = sc.nextInt();

        List<List<Integer>> petrolPumps = new ArrayList<>();

        System.out.println("Enter petrol and distance for each pump:");

        for (int i = 0; i < n; i++) {

            int petrol = sc.nextInt();
            int distance = sc.nextInt();

            List<Integer> pump = new ArrayList<>();
            pump.add(petrol);
            pump.add(distance);

            petrolPumps.add(pump);
        }

        int ans = truckTour(petrolPumps);

        System.out.println("Starting Pump Index: " + ans);

        sc.close();
    }
}
