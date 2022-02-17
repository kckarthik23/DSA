package com.DSA.arrays.problems;

public class TapWater2 {

	public static int findAmount(int[] arr)
	{
		int sum=0;
		int rightMax[]=new int[arr.length];
		int lefttMax[]=new int[arr.length];
		lefttMax[0]=arr[0];
		
		for(int i=1;i<arr.length;i++)
			lefttMax[i]=Math.max(lefttMax[i-1], arr[i]);
		
		rightMax[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
			rightMax[i]=Math.max(rightMax[i+1], arr[i]);
		
		/*
		 * for(int i=0;i<lefttMax.length;i++) System.out.print(lefttMax[i] );
		 */
		
		for(int i=1;i<arr.length;i++)
			sum+=Math.min(lefttMax[i], rightMax[i])-arr[i];
		
	return sum;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,0,3,4,1,0};
		System.out.println(findAmount(arr));;

	}

}
