package com.daynine.medwarehouse;

import java.util.ArrayList;

public class MergeSort {

    public static void mergeSort(ArrayList<Medicine> list, int si, int ei) {
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;

        mergeSort(list, si, mid);
        mergeSort(list, mid + 1, ei);

        merge(list, si, mid, ei);
    }

    private static void merge(ArrayList<Medicine> list, int si, int mid, int ei) {

        ArrayList<Medicine> temp = new ArrayList<>();

        int i = si;
        int j = mid + 1;

        while (i <= mid && j <= ei) {
            if (list.get(i).expiryDate.isBefore(list.get(j).expiryDate)) {
                temp.add(list.get(i++));
            } else {
                temp.add(list.get(j++));
            }
        }

        while (i <= mid) temp.add(list.get(i++));
        while (j <= ei) temp.add(list.get(j++));

        for (int k = 0; k < temp.size(); k++) {
            list.set(si + k, temp.get(k));
        }
    }
}

