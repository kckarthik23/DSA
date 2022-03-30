package com.LeetCode;

import java.util.Arrays;

public class Matrix2DSearch {
    public boolean searchMatrix(int[][] matrix, int target) {

        int[] arr = Arrays.stream(matrix).flatMapToInt(Arrays::stream).toArray();
        int s = 0;
        int e = arr.length - 1;
        return searchMatrix(s, e, arr, target);

    }

    boolean searchMatrix(int s, int e, int[] matrix, int target) {

        if (s <= e) {
            int m = s + (e - s) / 2;
            if (matrix[m] == target)
                return true;
            else if (matrix[m] > target) {
                e = m - 1;
                return searchMatrix(s, e, matrix, target);
            } else {
                s = m + 1;
                return searchMatrix(s, e, matrix, target);
            }
        }
        return false;
    }

    public boolean searchMatrixBetter(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        return searchMatrixBetter(start, end, matrix, target);
    }

    public boolean searchMatrixBetter(int start, int end, int[][] matrix, int target) {

        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (target >= matrix[mid][0] && target <= matrix[mid][matrix[0].length - 1]) {
                return binarySearch(matrix, mid, matrix[0].length - 1, 0, target);
            } else if (target < matrix[mid][0]) {
                end = mid - 1;
                return searchMatrixBetter(start, end, matrix, target);
            } else {
                start = mid + 1;
                return searchMatrixBetter(start, end, matrix, target);
            }
        }
        return false;
    }

    boolean binarySearch(int matrix[][], int row, int end, int start, int target) {
        if (start <= end) {

            int mid = start + (end - start) / 2;
            System.out.println("start " + start + " end " + end + "  mid " + mid + " row " + row);
            if (matrix[row][mid] == target)
                return true;
            else if (matrix[row][mid] > target) {
                end = mid - 1;
                return binarySearch(matrix, row, end, start, target);
            } else {
                start = mid + 1;
                return binarySearch(matrix, row, end, start, target);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 5 },
                { 6, 8, 10, 11 },
                { 12, 13, 14, 15 }

        };
        System.out.println(new Matrix2DSearch().searchMatrixBetter(matrix, 7));
    }
}