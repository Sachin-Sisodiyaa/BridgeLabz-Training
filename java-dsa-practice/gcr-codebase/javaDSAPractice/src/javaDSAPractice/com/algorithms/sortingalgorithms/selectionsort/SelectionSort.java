package javaDSAPractice.com.algorithms.sortingalgorithms.selectionsort;

public class SelectionSort {

    public void sort(int[] scores) {
        int n = scores.length;

        // One by one move boundary of unsorted part
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
}
