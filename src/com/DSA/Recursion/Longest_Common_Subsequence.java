package com.DSA.Recursion;

public class Longest_Common_Subsequence {

    public int lcs(String s1, String s2, int m, int n) {
        if (m < 0 || n < 0)
            return 0;

        if (s1.charAt(m) == s2.charAt(n))
            return 1 + lcs(s1, s2, m - 1, n - 1);
        else
            return Math.max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
    }

    public static void main(String[] args) {
        String s1 = "karthik";
        String s2 = "ktrc";
        System.out.println(new Longest_Common_Subsequence().lcs(s1, s2, s1.length() - 1, s2.length() - 1));

    }
}
