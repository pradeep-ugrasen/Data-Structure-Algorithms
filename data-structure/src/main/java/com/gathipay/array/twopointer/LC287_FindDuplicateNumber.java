package com.gathipay.array.twopointer;

import java.util.Arrays;

public class LC287_FindDuplicateNumber {
    
    public static int findTheDuplicateNumber(int [] nums){
        int result =-1;

        // Naive Solution
        /*for(int i =0; i<nums.length;i++){
            for(int j =i+1; j<nums.length;j++){
                if(nums[j] == nums[i]){
                    result = nums[i];
                }
            }
        }*/

        // Optimal Solution
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]) {
                return nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        System.out.println("Duplicate Number is :: "+LC287_FindDuplicateNumber.findTheDuplicateNumber(nums));

    }
}
