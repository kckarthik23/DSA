package com.hackerrank.java;

public class Anagram {
	private static final int EXTENDED_ASCII_CODES = 256;
	/*
	 * static boolean isAnagram(String a, String b) { // Complete the function int
	 * countarr[]=new int[a.length()]; boolean isAnagram=true;
	 * if(a.length()==b.length()){ for(int i=0;i<a.length();i++){ int c=0;
	 * 
	 * 
	 * for(int j=0;j<b.length();j++){
	 * if(Character.toLowerCase(a.charAt(i))==Character.toLowerCase(b.charAt(j)) ){
	 * ++c;
	 * 
	 * } } if(c==0) { //System.out.println("char not found "+i); return false;
	 * 
	 * } else countarr[i]=c;
	 * 
	 * } for(int i=0;i<a.length();i++) { int count=0; for(int j=0;j<a.length();j++)
	 * { if(a.charAt(i)==a.charAt(j)) { ++count; //System.out.println(i); } }
	 * 
	 * 
	 * if(!(countarr[i]==count)) { //
	 * System.out.println("char length is not equal i is "+i+" countarr[i] "
	 * +countarr[i] +" count "+count); return false; } }
	 * 
	 * } else return false;
	 * 
	 * return isAnagram;
	 * 
	 * }
	 */  //...this is my own logic and has more time comlexity
	
	
	
	
	public static boolean isAnagram(String str1, String str2) {

	  int[] chCounts = new int[EXTENDED_ASCII_CODES];
	  char[] chStr1 = str1.replaceAll("\\s", 
	    "").toLowerCase().toCharArray();
	  char[] chStr2 = str2.replaceAll("\\s", 
	    "").toLowerCase().toCharArray();

	  if (chStr1.length != chStr2.length) {
	    return false;
	  }

	  for (int i = 0; i < chStr1.length; i++) {
	    chCounts[chStr1[i]]++;
	    System.out.println(chCounts[chStr1[i]]+" "+chStr1[i]);
	    chCounts[chStr2[i]]--;
	  }

	  for (int i = 0; i < chCounts.length; i++) {
		  System.out.println(chCounts.length);
	    if (chCounts[i] != 0) {
	      return false;
	    }
	  }

	  return true;
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("Hello", "Hello"));
		
		

	}

}
