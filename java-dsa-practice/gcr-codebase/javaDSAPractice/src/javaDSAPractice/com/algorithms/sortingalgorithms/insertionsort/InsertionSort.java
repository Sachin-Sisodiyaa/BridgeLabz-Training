package javaDSAPractice.com.algorithms.sortingalgorithms.insertionsort;

public class InsertionSort {

    // Method to perform insertion sort
    public void sort(int[] employeeIds) {
        int n = employeeIds.length;

        for (int i = 1; i < n; i++) {
            int key = employeeIds[i];
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            // Insert key at correct position
            employeeIds[j + 1] = key;
        }
    }
}
