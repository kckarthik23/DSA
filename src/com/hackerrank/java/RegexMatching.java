package com.hackerrank.java;

import java.util.regex.Pattern;

public class RegexMatching {
	
	
	
	
	public static void main(String[] args) {
		/*
		 * String s="Dr.x"; String pattern
		 * ="(^((Mr)|(Mrs)|(Ms)|(Dr)|(Er))\\.([a-z]|[A-Z])$)"; boolean a =
		 * Pattern.matches(pattern, s);
		 * 
		 * System.out.println(a);
		 */
		String s="102, 1948948 and 1.3 and 4.5";
		 String pattern =".*\\d+.*";
		 boolean a = Pattern.matches(pattern, s);
	
		System.out.println(a);
		/*
		 * for(String token:a) {
		 * 
		 * System.out.println(token); }
		 */
		

	}

}
