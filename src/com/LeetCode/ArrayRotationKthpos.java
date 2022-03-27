package com.LeetCode;

public class ArrayRotationKthpos {
    public static int[] rotateKth(int nums[], int k) {
        k=k%nums.length;
        int temp[] = new int[k];
        for (int i = 0; i < k; i++)
            temp[i] = nums[nums.length - k + i];

        for (int i = nums.length - 1 - k; i >= 0; i--)
            nums[i + k] = nums[i];

        for (int i = 0; i < k; i++)
            nums[i] = temp[i];

        return nums;

    }

    public static void main(String[] args) {
        int nums[] = { -1,1,3};
        int res[] = rotateKth(nums, 2);
        for (int val : res)
            System.out.print(val+" ");
    }
}
