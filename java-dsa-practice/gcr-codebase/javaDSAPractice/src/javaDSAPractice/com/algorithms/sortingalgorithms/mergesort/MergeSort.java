package javaDSAPractice.com.algorithms.sortingalgorithms.mergesort;

public class MergeSort {

    // Public method to start merge sort
    public void sort(double[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort first half
            sort(prices, left, mid);

            // Sort second half
            sort(prices, mid + 1, right);

            // Merge both halves
            merge(prices, left, mid, right);
        }
    }

    // Method to merge two sorted halves
    private void merge(double[] prices, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = prices[left + i];

        for (int j = 0; j < n2; j++)
            rightArray[j] = prices[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the temp arrays
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
