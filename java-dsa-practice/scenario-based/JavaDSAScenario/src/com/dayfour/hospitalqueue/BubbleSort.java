package com.dayfour.hospitalqueue;

public class BubbleSort {
	
	public static void sort(int[] patientNo, int[] criticality) {
		for(int s=0; s<patientNo.length-1; s++) {
			
			boolean check = false;
			for(int a=s + 1; a<patientNo.length; a++) {
				if(criticality[s] < criticality[a]) {
					int temp = criticality[s];
					criticality[s] = criticality[a];
					criticality[a] = temp;
					
					//swap patient number
					int tempP = patientNo[s];
					patientNo[s] = patientNo[a];
					patientNo[a] = tempP;
					
					check = true;
				}
			}
			
			if(!check) {
				return;
			}
		}
	
	} 
}
