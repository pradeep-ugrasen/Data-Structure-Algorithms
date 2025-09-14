package com.gathipay.array.twopointer;

import com.gathipay.array.basic.DisplayArray;

public class LC27_RemoveElement {
    
    public static int [] removeElement(int [] nums, int k){
        int left =0;
        int [] result = new int [nums.length];
        
        for(int right =0; right<nums.length; right++){
            if(nums[right] != k){
                result[left++] = nums[right];
            }
        }      
        return result;
    }

    public static void main(String[] args) {
        
        int [] nums ={3,2,2,3}; int k =3;
        DisplayArray.displayArray(LC27_RemoveElement.removeElement(nums, k));
    }
}
