package com.DSA.Sorting;

public class InsertionSort {
    // Reverse Order
    public static int[] insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 7, 1, 9 };
        int res[] = insertionSort(arr);
        for (int i : res)
            System.out.println(i);
    }

}
