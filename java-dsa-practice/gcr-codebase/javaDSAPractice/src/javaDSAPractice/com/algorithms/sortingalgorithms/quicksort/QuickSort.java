package javaDSAPractice.com.algorithms.sortingalgorithms.quicksort;

public class QuickSort {

    // Method to start quick sort
    public void sort(double[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // Sort left part
            sort(prices, low, pivotIndex - 1);

            // Sort right part
            sort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method
    private int partition(double[] prices, int low, int high) {
        double pivot = prices[high]; // choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                // swap prices[i] and prices[j]
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // place pivot in correct position
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }
}

