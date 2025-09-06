package com.gathipay.array.basic;

public class RunningSum {

    public static int runningSum(int [] nums){
        int result =0;
        for(int i =0; i<nums.length;i++){
            result +=nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int nums [] = {1,3,-4,5,6};
        System.out.println("Sum Of the array :: "+ RunningSum.runningSum(nums));
    }
}