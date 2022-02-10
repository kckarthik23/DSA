package com.DSA.Strings;

public class LeftNonrepeatedChar {

    public static int leftNonRepeatedChar(String s1) {
        int chr[] = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            chr[s1.charAt(i)]++;
        }

        for (int j = 0; j < s1.length(); j++) {
            if (chr[s1.charAt(j)] == 1)
                return j;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "abcba";
        System.out.println(leftNonRepeatedChar(s1));

    }

}
