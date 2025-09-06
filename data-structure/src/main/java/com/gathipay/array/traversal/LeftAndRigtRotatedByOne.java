package com.gathipay.array.traversal;

import com.gathipay.array.basic.DisplayArray;

public class LeftAndRigtRotatedByOne {
    
    public static void leftRotatedByOne(int [] nums){
        int temp = nums[0];
        for(int i =1; i<nums.length;i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length -1] = temp;
        DisplayArray.displayArray(nums);
    }

     public static void rightRotatedByOne(int [] nums){
        int n = nums.length-1;
        int temp = nums[n-1];
        for (int i = n - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
  
        nums[0] = temp;
        DisplayArray.displayArray(nums);
    }

    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5};
        LeftAndRigtRotatedByOne.leftRotatedByOne(nums);
        System.out.println();
        LeftAndRigtRotatedByOne.rightRotatedByOne(nums);
    }
}
