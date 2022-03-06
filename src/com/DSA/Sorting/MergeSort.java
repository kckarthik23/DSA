package com.DSA.Sorting;

public class MergeSort {

    public static int[] mergeSort(int arr[], int start, int last) {

        if (start < last) {
            int mid = start + (last - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, last);
            merge(arr, start, mid, last);
        }
        return arr;
    }

    // Used more variables so needs memory efficient solution
    private static void merge(int[] arr, int start, int mid, int last) {
        int arr1[] = new int[mid - start + 1];
        int arr2[] = new int[last - mid];
        int temp[] = new int[last - start + 1];
        for (int i = 0; i <= mid - start; i++)
            arr1[i] = arr[start + i];

        for (int j = 0; j < last - mid; j++)
            arr2[j] = arr[mid + j + 1];
        int m = arr1.length;
        int n = arr2.length;
        int k = 0;
        int h = 0;
        int l = 0;
        while (h < m && l < n) {
            if (arr1[h] > arr2[l]) {
                temp[k] = arr2[l];
                l++;

            } else {

                temp[k] = arr1[h];
                h++;
            }

            k++;
        }

        while (h < m) {

            temp[k] = arr1[h];
            h++;
            k++;
        }

        while (l < n) {

            temp[k] = arr2[l];
            l++;
            k++;
        }
        for (int a = 0; a < temp.length; a++)
            arr[a + start] = temp[a];

        /*
         * for (int val : arr)
         * System.out.println(val);
         */

    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 2, 9, 0, 3, 1, 8, 6, 4 };
        int res[] = mergeSort(arr, 0, arr.length - 1);
        for (int finalVal : res)
            System.out.println(finalVal);

    }
}
