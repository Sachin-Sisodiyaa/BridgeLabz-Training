package com.dayfour.zipzipmart;

class MergeSort {

    public static void sort(Transaction[] transactions, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            sort(transactions, start, mid);
            sort(transactions, mid + 1, end);

            merge(transactions, start, mid, end);
        }
    }

    private static void merge(Transaction[] transactions, int start, int mid, int end) {

        int n1 = mid - start + 1;
        int n2 = end - mid;

        Transaction[] left = new Transaction[n1];
        Transaction[] right = new Transaction[n2];

        for (int i = 0; i < n1; i++)
            left[i] = transactions[start + i];

        for (int j = 0; j < n2; j++)
            right[j] = transactions[mid + 1 + j];

        int i = 0, j = 0, k = start;

        while (i < n1 && j < n2) {

            // sort by date, then amount
            if (left[i].date.isAfter(right[j].date) ||
               (left[i].date.isEqual(right[j].date) &&
                left[i].amount >= right[j].amount)) {

                transactions[k++] = left[i++];
            } else {
                transactions[k++] = right[j++];
            }
        }

        while (i < n1)
            transactions[k++] = left[i++];

        while (j < n2)
            transactions[k++] = right[j++];
    }
}
