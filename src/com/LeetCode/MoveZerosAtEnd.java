package com.LeetCode;

public class MoveZerosAtEnd {
    public void moveZeroes(int[] nums) {
        int zeroindex = 0;
        if (nums.length > 1)
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[zeroindex++] = nums[i];

                }
            }
        if (nums.length > 1)
            for (int i = zeroindex; i < nums.length; i++)
                nums[i] = 0;

    }
}
