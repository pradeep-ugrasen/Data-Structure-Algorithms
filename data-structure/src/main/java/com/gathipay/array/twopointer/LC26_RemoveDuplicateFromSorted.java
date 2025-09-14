package com.gathipay.array.twopointer;

import com.gathipay.array.basic.DisplayArray;

public class LC26_RemoveDuplicateFromSorted {
    
    public static int [] removeDuplicateFromSortedArray(int [] nums){
        int [] result = new int[nums.length];
        int left =0;
        result[left] = nums[0];  
        for(int right=1; right<nums.length;right++){
            if(nums[right] != nums[left]){
                left++;
                result[left] = nums[right];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums ={1,1,2};
        DisplayArray.displayArray(LC26_RemoveDuplicateFromSorted.removeDuplicateFromSortedArray(nums));
    }
}
