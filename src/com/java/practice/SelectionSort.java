package com.java.practice;

public class SelectionSort {

    public static int thirdHighest(int arr[], int n) {
        int max;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            max = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    maxIndex = j;
                }

            }
            int temp;
            temp = arr[i];
            arr[i] = max;
            arr[maxIndex] = temp;

        }
        return arr[2];
    }

    public static int[] sortzeros(int arr[]) {

        // int newarr[] = new int[arr.length];
        int zeroCount;
        int nescount;
        return null;

    }

    public static void main(String[] args) {

        int arr[] = { -1000, -1, -1, -1000, 4, 4 };
        // int arr2[] = { 1, 1, 0, 0, 1, 0 };
        System.out.println(thirdHighest(arr, 3));

    }

}
