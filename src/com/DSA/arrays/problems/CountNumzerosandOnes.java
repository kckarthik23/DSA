package com.DSA.arrays.problems;

public class CountNumzerosandOnes {

    public static int[] sortZerosandOnes(int arr[]) {
        int zerosFreq = 0;

        for (int v : arr) {
            if (v == 0)
                zerosFreq++;

        }
        int res[] = new int[arr.length];

        for (int i = zerosFreq; i < arr.length; i++) {
            res[i] = 1;

        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 0, 1, 1, 0, 1 };
        int res[] = sortZerosandOnes(arr);
        for (int val : res)
            System.out.println(val);

    }
}
