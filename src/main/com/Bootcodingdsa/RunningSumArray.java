package com.Bootcodingdsa;

public class RunningSumArray {
    public static void main(String[] args) {

    }
    public int[] runningSum(int[] nums) {
        int a[]=new int[nums.length];
        for(int i =0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=nums[j];
            }
            a[i]=sum;
        }
        return a;

    }

}

