package com.DSA.Sorting;

public class SelectionSort {

    public static int[] selectionSort(int arr[]) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i];
            maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            swap(arr, maxIndex, i);
        }

        return arr;
    }

    private static void swap(int arr[], int maxIndex, int i) {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[maxIndex];
        arr[maxIndex] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 8, 1, 3, 4, 5, 6, 0, 9, 7,7,8 };
        int res[] = selectionSort(arr);
        for (int val : res)
            System.out.println(val);

    }

}
