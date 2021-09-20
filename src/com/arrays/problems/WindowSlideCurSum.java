package com.arrays.problems;

public class WindowSlideCurSum {
	
	public static boolean findSum(int sum, int ar[])
	{
		int cursum=ar[0];int start=0;
		for(int end=1;end<=ar.length;end++)
		{
			
			
			while(cursum >sum && start<end)
			{
				System.out.println(cursum+"start is"+start+"end is"+end);
				cursum-=ar[start];
				start++;
			}
			
			if(cursum==sum)
				return true;
			
			if(end<ar.length)
			cursum+=ar[end];
			
			System.out.println("last cursum "+cursum);
		}
		return cursum==sum;
	}

	public static void main(String[] args) {
	int ar[]= {2,3,4,6,9,7};
	System.out.println(findSum(16, ar));

	}

}
