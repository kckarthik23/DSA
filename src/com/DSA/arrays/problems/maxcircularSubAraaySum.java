package com.DSA.arrays.problems;

public class maxcircularSubAraaySum {
//big O of n2---->O(n2) not suitable
    public static int maxCircSubArrrSum(int arr[]) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int cur_sum = arr[i];
            int cur_max = arr[i];
            for (int j = 1; j < arr.length; j++) {
                int ind = (i + j) % arr.length;
                cur_sum += arr[ind];
                cur_max = Math.max(cur_max, cur_sum);
            }
            res = Math.max(res, cur_max);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 1, 2, 3 };
        System.out.println(maxCircSubArrrSum(arr));
    }
}
