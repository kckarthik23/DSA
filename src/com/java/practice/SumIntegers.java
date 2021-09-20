package com.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SumIntegers {
	
	
	
	
	static int sumInt(List<Integer> integers)
	{
		return integers.stream().filter(o->Objects.nonNull(o)).mapToInt(Integer::intValue).sum();
	}
	
	

	public static void main(String[] args) {
		List<Integer> m=new ArrayList<Integer>();
		m.add(2);
		m.add(null);
		m.add(18);
		// TODO Auto-generated method stub
		System.out.println(sumInt(m));

	}

}
