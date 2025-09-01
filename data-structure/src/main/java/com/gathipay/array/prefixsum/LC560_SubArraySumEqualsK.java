package com.gathipay.array.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class LC560_SubArraySumEqualsK {
    
    public static int subArraysSum(int [] nums, int k){
        
        int count =0;
        int n = nums.length;

        /* Brute force approach  TC - N^2
        for(int i=0; i<n; i++){
            int sum =0;
            for(int j =i; j <n; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        } */

        /* Optimal Approach */
        int prefixsum =0;
        Map<Integer,Integer> prefixSumFrequency = new HashMap<>();
        prefixSumFrequency.put(0, 1);

        for(int num : nums){
            prefixsum +=num;
            if(prefixSumFrequency.containsKey(prefixsum -k)) {
                count += prefixSumFrequency.get(prefixsum -k);
            }

            prefixSumFrequency.put(prefixsum, prefixSumFrequency.getOrDefault(prefixsum, 0) +1);
        }
        return count;
    }


    public static void main(String[] args) {
        int [] nums = {1,2,3,-2,4};
        int k =5;
        System.out.println("Sum array Sum =>"+ LC560_SubArraySumEqualsK.subArraysSum(nums, k));
    }
}
