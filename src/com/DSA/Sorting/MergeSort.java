package com.DSA.Sorting;

public class MergeSort {

    public static int[] mergeSort(int arr[],int start,int last) {

        while(start<last)
        {
            int mid=start+(last-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1, last);
            merge(arr,start,mid,last);
        }
        
    }

    private static void merge(int[] arr, int start, int mid,int last) {
        int arr1[]=new int[mid-start+1];
        int arr2[]=new int[last-mid];
        
        for(int i=0;i<mid;i++)
        arr1[i]=arr[start+i];

        for(int j=0;j<mid;j++)
        arr1[j]=arr[last-mid];

    }
    
}
