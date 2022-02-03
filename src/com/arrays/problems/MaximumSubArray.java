package com.arrays.problems;

public class MaximumSubArray {
	
	public static int[] maxSubArr(int arr[])
	{
		int res[]=new int[3];
		int start;
		int s=0;
		int end=0;
		int max_ending=arr[0];
		int max_So_far=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			max_ending=max_ending+arr[i];
			if(max_So_far<max_ending)
			{
				max_So_far=max_ending;
				start=s;
				end=i;
			}
			else if(max_ending<0)
			{
				max_ending=0;
				s=i+1;
			}
		}
		res[0]=s;
		res[1]=end;
		res[2]=max_So_far;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-2, -3, 4, -1, -2, 1, 5, -3};
		int res[]=maxSubArr(arr);
		for(int val:res)
			System.out.println(val);

	}

}
