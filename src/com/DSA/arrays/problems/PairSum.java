package com.DSA.arrays.problems;

public class PairSum {

    public static int[] pairSum(int arr[], int sum) {
        int i = 0;
        int j = arr.length - 1;
        int n = arr.length;
        int res[] = new int[2];

        while (i != j) {
            if (arr[i] + arr[j] == sum) {
                res[0] = i;
                res[1] = j;
                return res;
            } else if (arr[i] + arr[j] < sum)
                i++;
            else
                j--;
        }
        return res;
    }

    public static void main(String[] args) {

        int arr[] = { -20, -10, -5, -1, 2, 5, 30 };
        int rsult[] = pairSum(arr, 0);
        for (int val : rsult)
            System.out.println(val);

    }

}
