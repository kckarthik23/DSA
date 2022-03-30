package com.LeetCode;

import java.util.Stack;

//more space consumed

public class Reversewords {

    public static String reverseWords(String s) {
        char ch[] = s.toCharArray();
        String words = "";
        String result = "";
        Stack<Character> st = new Stack<>();

        for (Character chv : ch)
            st.push(chv);

        System.out.println(st.toString());
        while (!st.isEmpty()) {
            words += st.pop();

        }
        String inter[] = words.split(" ");
        for (int i = inter.length - 1; i >= 0; i--) {
            if (i != 0)
                result += inter[i] + " ";
            else
                result += inter[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Karthik is a good boy"));

    }
}
