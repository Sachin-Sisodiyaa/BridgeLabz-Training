package com.daysix.fleetmanager;

public class MergeSort {

    public static void sort(Vehicle[] arr, int si, int ei) {
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;

        sort(arr, si, mid);
        sort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(Vehicle[] arr, int si, int mid, int ei) {
        Vehicle[] temp = new Vehicle[ei - si + 1];

        int i = si, j = mid + 1, k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i].mileage <= arr[j].mileage) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= ei) temp[k++] = arr[j++];

        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }
}
