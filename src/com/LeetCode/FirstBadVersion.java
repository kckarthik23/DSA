package com.LeetCode;

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        int result = -1;
        return firstBadVersion(start, end, result);

    }

    private int firstBadVersion(int start, int end, int result) {

        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                result = mid;
                end = mid - 1;
                return firstBadVersion(start, end,result);
            } else {
                start = mid + 1;
                return firstBadVersion(start, end, result);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        FirstBadVersion fis = new FirstBadVersion();

        System.out.println(fis.firstBadVersion(10));
    }
}