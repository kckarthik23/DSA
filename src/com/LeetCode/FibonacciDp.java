package com.LeetCode;

public class FibonacciDp {

    int n;
    int fib[];

    FibonacciDp(int n) {
        this.n = n;
        fib = new int[n + 1];
    }

    public int nFibonacci(int n) {
        if (fib[n] > 0)
            return fib[n];

        if (n <= 1) {
            fib[n] = n;
            return fib[n];
        }

        else {
            fib[n] = nFibonacci(n - 2) + nFibonacci(n - 1);
            return fib[n];
        }
    }

    public static void main(String[] args) {
        FibonacciDp fib = new FibonacciDp(4);
        System.out.println(fib.nFibonacci(fib.n));
        ;
    }
}
