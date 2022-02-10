package com.DSA.Strings;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {
        int Ch[] = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            Ch[s1.charAt(i)]++;
            Ch[s2.charAt(i)]--;
        }

        for (int i = 0; i < Ch.length; i++) {
            if (Ch[i] > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "karthik";
        String s2 = "rthjkak";
        System.out.println(isAnagram(s1, s2));

    }

}
