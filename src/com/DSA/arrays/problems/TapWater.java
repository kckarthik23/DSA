package com.DSA.arrays.problems;

public class TapWater {
	
	public static int amountOfwater(int arr[])
	{
		int sum=0;
		for (int i=1;i<arr.length-1;i++)
		{
		int leftMax=arr[i];
		
		for(int j=0;j<i;j++)
          leftMax=Math.max(leftMax, arr[j]);
		int rightMax=arr[i];
		
		for(int j=i+1;j<arr.length;j++)
		    rightMax=Math.max(rightMax, arr[j]);
		
		sum+=Math.min(rightMax, leftMax)-arr[i];
		
		}
		
	
		
		return sum;
	}

	public static void main(String[] args) {
	int arr[] ={3,4,5,2,1};
	
	System.out.println(amountOfwater(arr));
	
	

	}

}
