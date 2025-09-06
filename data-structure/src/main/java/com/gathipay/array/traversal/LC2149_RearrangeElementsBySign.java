package com.gathipay.array.traversal;

import com.gathipay.array.basic.DisplayArray;

public class LC2149_RearrangeElementsBySign {
    
    public static void reArrangeElementBySign(int [] nums){
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

        DisplayArray.displayArray(result);
    }

    public static void main(String[] args) {
        int [] nums ={3,1,-2,-5,2,-4};
        LC2149_RearrangeElementsBySign.reArrangeElementBySign(nums);
    }
}
