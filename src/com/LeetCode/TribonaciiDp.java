package com.LeetCode;

public class TribonaciiDp {
    public int tribonacci(int n) {
        int trib[] = new int[n + 1];

        return tribonacci(n, trib);

    }

    public int tribonacci(int n, int[] trib) {
        if (trib[n] > 0) {
            return trib[n];
        }
        if (n < 2) {
            trib[n] = n;
            return trib[n];
        }

        if (n == 2) {
            trib[n] = 1;
            return trib[n];
        }

        else {
            trib[n] = tribonacci(n - 3, trib) + tribonacci(n - 1, trib) + tribonacci(n - 2, trib);
            return trib[n];
        }
    }

    public static void main(String[] args) {
        TribonaciiDp tri = new TribonaciiDp();
        System.out.println(tri.tribonacci(32));
    }
}
