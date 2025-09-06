package com.gathipay.array.traversal;

import com.gathipay.array.basic.DisplayArray;

public class ReverseArray {
    
    public static void reverseArray(int [] nums){
        int startIndex =0;
        int endIndex= nums.length-1;

        while (startIndex < endIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp; 
            
            startIndex++;
            endIndex--;
        }

        DisplayArray.displayArray(nums);
    }

    public static void main(String[] args) {
        int [] nums = {10,20,40,30,50};
        ReverseArray.reverseArray(nums);
    }
}
