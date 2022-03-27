package com.LeetCode;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int r = numbers.length - 1;
        int l = 0;
        int res[] = new int[2];
        while (l <= r) {
            if (numbers[l] + numbers[r] == target) {
                res[0] = ++l;
                res[1] = ++r;
                return res;
            } else if (numbers[r] + numbers[l] > target)
                r--;
            else
                l++;
        }
        return res;

    }
}
