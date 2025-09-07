package com.gathipay.array.traversal;

import com.gathipay.array.basic.DisplayArray;

public class LC189_RotateArrayByKElement {
    
    private static void reverse(int [] nums, int startIndex, int endIndex){
        while (startIndex < endIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
    public static void rotateArrayByRightKthElement(int [] nums, int k){
        int n = nums.length; 
        k %= nums.length;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);

        DisplayArray.displayArray(nums);
    }

     public static void rotateArrayByLeftKthElement(int [] nums, int k){
        int n = nums.length; 
        k %= nums.length;
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, n-1);

        DisplayArray.displayArray(nums);
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        LC189_RotateArrayByKElement.rotateArrayByRightKthElement(nums, 2);
        System.out.println();
        LC189_RotateArrayByKElement.rotateArrayByLeftKthElement(nums, 2);
    }
}
