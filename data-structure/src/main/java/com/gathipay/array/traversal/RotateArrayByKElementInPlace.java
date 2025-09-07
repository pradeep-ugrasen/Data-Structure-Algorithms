package com.gathipay.array.traversal;

import com.gathipay.array.basic.DisplayArray;

public class RotateArrayByKElementInPlace {
    
    public static void rotateArrayByKElementInPlace(int [] nums, int k){
        int n = nums.length;
        for(int i =0; i<n; i=i+k){  
            int startIndex=i;
            int endIndex = i+k-1;

            if(endIndex > n-1){
                endIndex = n-1;
            }

            while (startIndex < endIndex) {
                int temp = nums[startIndex];
                nums[startIndex] = nums[endIndex];
                nums[endIndex] = temp;

                startIndex++;
                endIndex--;
            }
        }

        DisplayArray.displayArray(nums);
    }

    public static void main(String[] args) {
        int [] nums ={1, 2, 3, 4, 5, 6, 7, 8, 9};
        RotateArrayByKElementInPlace.rotateArrayByKElementInPlace(nums, 3);

    }
}
