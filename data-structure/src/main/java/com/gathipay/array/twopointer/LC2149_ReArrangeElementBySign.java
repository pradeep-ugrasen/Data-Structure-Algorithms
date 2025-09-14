package com.gathipay.array.twopointer;

import com.gathipay.array.basic.DisplayArray;

public class LC2149_ReArrangeElementBySign {
    
     public static int[] rearrangeArray(int[] nums) {

        int positiveIndex =0;
        int negativeIndex =1;
        int [] result = new int[nums.length];

        for(int i =0; i<nums.length;i++){
            if(nums[i] < 0){
                result[negativeIndex] = nums[i];
                negativeIndex +=2;
            }else{
                result[positiveIndex] = nums[i];
                positiveIndex +=2;
            }
        } 
        return result;
    }

    public static void main(String[] args) {
        int  [] nums = {3,1,-2,-5,2,-4};
        DisplayArray.displayArray(LC2149_ReArrangeElementBySign.rearrangeArray(nums));
    
    }
}
