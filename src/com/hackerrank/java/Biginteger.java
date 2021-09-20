package com.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Biginteger {

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n;
		try {
			n = bufferedReader.readLine();
			//int n1=Integer.parseInt(n);
			BigInteger bi=new BigInteger(n);
			;
			System.out.println(bi.isProbablePrime(1));
			
		//System.out.println(bi.isProbablePrime(Integer.valueOf(n)));
			
            bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        




	}

}
