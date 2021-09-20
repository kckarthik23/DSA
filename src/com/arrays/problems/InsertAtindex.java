package com.arrays.problems;

public class InsertAtindex {
	public static void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
		if(index>=0&&index<arr.length)
		{
		for (int i = sizeOfArray - 1; i >= 0; i--) {
			
			if (i != index && i != 0) {
				arr[i] = arr[i - 1];
			} else if(i==index) {
				arr[i] = element;
				break;
			}

		}
		}

		
		 System.out.println();
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]);
			 
		 }
		// System.out.println(arr.length);
		 
		 

	}

	public static void main(String[] args) {
		int arr[] = new int[5];
		//System.out.println(arr.length);
		for (int i = 0; i < arr.length - 1; i++)
		{
			arr[i] = i;
			//System.out.println(i);
		}

		
		
		  for (int i = 0; i < arr.length; i++) 
			  System.out.print(arr[i]);
		 
		  
		 		insertAtIndex(arr, arr.length, 9999, 90);

	}

}
