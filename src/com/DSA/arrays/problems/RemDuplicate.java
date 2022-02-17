package com.DSA.arrays.problems;

public class RemDuplicate {
	
	public static int[] remduplicate(int arr[])
	{
		int j=0;
		for (int i=0;i+1<arr.length;i++)
		{
			if(arr[i]!=arr[i+1])
				arr[j++]=arr[i];
				
				
		}
		arr[j]=arr[arr.length-1];
		
		return arr;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,2,2,3,3,3,4,4,4,};
		int ar[]=remduplicate(arr);
		
		for(int i=0;i<ar.length;i++)
			System.out.println(ar[i]);

	}

}
