package com.dayfour.examcell;

public class MergeSort {

    public static void sort(float[] totalScores, int si, int ei) {

        if (si < ei) { 
            int mid = si + (ei - si) / 2;

            sort(totalScores, si, mid);       
            sort(totalScores, mid + 1, ei);

            merge(totalScores, si, mid, ei);
        }
    }

    public static void merge(float[] totalScores, int si, int mid, int ei) {

        float temp[] = new float[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (totalScores[i] >= totalScores[j]) { 
                temp[k++] = totalScores[i++];
            } else {
                temp[k++] = totalScores[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = totalScores[i++];
        }

        while (j <= ei) {
            temp[k++] = totalScores[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            totalScores[si + x] = temp[x];
        }
    }
}
