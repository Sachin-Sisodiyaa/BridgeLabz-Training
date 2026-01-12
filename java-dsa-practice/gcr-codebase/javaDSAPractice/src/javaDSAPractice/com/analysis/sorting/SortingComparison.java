package javaDSAPractice.com.analysis.sorting;

import java.util.Arrays;

public class SortingComparison {

    public static void main(String[] args) {

        int N = 10000;  // Change size to test
        int[] data = new int[N];

        for (int i = 0; i < N; i++) {
            data[i] = (int) (Math.random() * N);
        }

        int[] bubbleArr = Arrays.copyOf(data, data.length);
        int[] mergeArr = Arrays.copyOf(data, data.length);
        int[] quickArr = Arrays.copyOf(data, data.length);

        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        //Bubble Sort
        long startBubble = System.nanoTime();
        bubbleSort.sort(bubbleArr);
        long endBubble = System.nanoTime();

        //Merge Sort
        long startMerge = System.nanoTime();
        mergeSort.sort(mergeArr, 0, mergeArr.length - 1);
        long endMerge = System.nanoTime();

        //Quick Sort
        long startQuick = System.nanoTime();
        quickSort.sort(quickArr, 0, quickArr.length - 1);
        long endQuick = System.nanoTime();

        System.out.println("Dataset Size: " + N);
        System.out.println("Bubble Sort Time: " + (endBubble - startBubble) / 1_000_000.0 + " ms");
        System.out.println("Merge Sort Time: " + (endMerge - startMerge) / 1_000_000.0 + " ms");
        System.out.println("Quick Sort Time: " + (endQuick - startQuick) / 1_000_000.0 + " ms");
    }
}

