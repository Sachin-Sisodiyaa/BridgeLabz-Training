/*5. ExamCell – Student Rank Generator (Merge Sort)
Story: An online exam system collects scores from multiple test centers. To publish a
state-level rank list, student scores are merged and sorted using Merge Sort, ensuring
performance and accuracy.
Key Concepts:
● Merging pre-sorted center-wise scores
● Sorting across centers
● High efficiency for big data*/






package com.dayfour.examcell;

public class ExamCellMain {
	
	public static void main(String[] args) {
		
		float center1[] = {99.9f, 87.6f, 74.4f, 91f, 71.6f};
		float center2[] = {65.5f, 93f, 80.4f, 97f, 49.6f};
		float center3[] = {59.9f, 98.6f, 55.2f, 70f, 33f};
		
		int n = center1.length + center2.length + center3.length;
		
		float totalScores[] = new float[n];
		
		int idx = 0;
		for(float s : center1) {
			totalScores[idx++] = s;
		}
		for(float s : center2) {
			totalScores[idx++] = s;
		}
		for(float s : center3) {
			totalScores[idx++] = s;
		}
		
		MergeSort.sort(totalScores, 0, totalScores.length-1);
		
		System.out.println("\nState-Level Ranks and Scores accross all centers: ");
		for(int i=0; i<n; i++) {
			System.out.println("\nRank -> " + (i + 1) + "	| " + "Score: " + totalScores[i]);
		}
	}
}
