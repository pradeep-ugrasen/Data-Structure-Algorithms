package com.gathipay.array.prefixsum;

public class LC2270_NoOfWaysToSplit {
    
    public static int findNoOfWaysToSplit(int [] nums){
        long totalSum =0;
        long leftSum =0;
        int result =0;

        for(int i=0; i<nums.length;i++){
            totalSum +=nums[i];
        }

        for(int i =0; i<nums.length-1;i++){
            leftSum +=nums[i];
            long rightSum = totalSum -leftSum;
            if(leftSum >= rightSum){
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int [] nums ={10,4,-8,7};
        System.out.println("Number Of Ways To Split ::"+LC2270_NoOfWaysToSplit.findNoOfWaysToSplit(nums));
    }
}
