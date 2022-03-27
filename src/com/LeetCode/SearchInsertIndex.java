package com.LeetCode;

class searchInsertIndex {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pos = -1;
        return searchInsert(nums, start, end, target, pos);

    }

    public static int searchInsert(int[] nums, int start, int end, int target, int pos) {

        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target) {
                end = mid - 1;
                pos = mid;

                return searchInsert(nums, start, end, target, pos);
            } else {
                start = mid + 1;
                pos = start;

                return searchInsert(nums, start, end, target, pos);
            }

        }
        return pos;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 7, 9 };
        System.out.println(searchInsert(nums, 5));
    }
}
