package com.DSA.Searching;

class BinarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        return serach(nums, start, end, target);

    }

    public int serach(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target) {
                end = mid - 1;
                serach(nums, start, end, target);
            } else {
                start = mid + 1;
                serach(nums, start, end, target);
            }
        }
        return -1;
    }
}