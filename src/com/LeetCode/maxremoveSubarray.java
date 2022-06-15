package com.LeetCode;

public class maxremoveSubarray {

    public int maxEleRemoveSub(int [] nums,int target)
    {
        int sum=0;
        for(int val:nums)
        sum+=val;
int max=Integer.MIN_VALUE;
        int l=0;int n=nums.length;
        for(int r=0;r<n;r++)
        {
            sum-=nums[r];
            while(sum<target&&l<=r)
            {
sum+=nums[l++];
            }
            if(sum==target)
            max=Math.max(max, r-l+1);
        }
        return max==Integer.MIN_VALUE?-1:max;
    }

    public static void main(String[] args) {
        int [] nums={1,3,5,7,8};
        System.out.println(new maxremoveSubarray().maxEleRemoveSub(nums, 7));
    }
    
}
