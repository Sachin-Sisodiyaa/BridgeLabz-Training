package com.dayseven.eduresults;

import java.util.ArrayList;

public class MergeSort {

    public static void mergeSort(ArrayList<Student> list, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(list, si, mid);
        mergeSort(list, mid + 1, ei);
        merge(list, si, mid, ei);
    }

    private static void merge(ArrayList<Student> list, int si, int mid, int ei) {
        ArrayList<Student> temp = new ArrayList<>();

        int i = si;
        int j = mid + 1;

        while (i <= mid && j <= ei) {
            if (list.get(i).marks >= list.get(j).marks) {
                temp.add(list.get(i));
                i++;
            } else {
                temp.add(list.get(j));
                j++;
            }
        }

        while (i <= mid) {
            temp.add(list.get(i));
            i++;
        }

        while (j <= ei) {
            temp.add(list.get(j));
            j++;
        }

        for (int k = 0; k < temp.size(); k++) {
            list.set(si + k, temp.get(k));
        }
    }
}
