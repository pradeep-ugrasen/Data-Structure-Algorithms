package com.gathipay.array.prefixsum;

public class LC1991_MiddleIndex {
    
    public static int findMiddleIndex(int [] nums){
        int totalSum = 0;
        int sum =0;

        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }
        
        for(int i=0; i<nums.length;i++) {
            totalSum -=nums[i];
            System.out.println(totalSum +" ,"+sum);
            if(sum == totalSum){
                return i;
            } 
            sum +=nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
         int nums [] = {2,3,-1,8,4}; 
        System.out.println("Middle Index is :: "+ LC1991_MiddleIndex.findMiddleIndex(nums));    
    }
}
