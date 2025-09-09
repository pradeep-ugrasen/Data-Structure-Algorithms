package com.gathipay.array.prefixsum;

import com.gathipay.array.basic.DisplayArray;

public class LC1480_RunningSum {

    public static int [] runningSum(int [] nums){
        for(int i =1;i<nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
    
    public static void main(String[] args) {
        
        int nums [] = {1,3,-4,5,6};
        DisplayArray.displayArray(LC1480_RunningSum.runningSum(nums));
    }
}