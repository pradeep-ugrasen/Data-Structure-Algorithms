package com.gathipay.array.basic;

public class ConcatenateArray {
   
    public static void concatenateArrayTwice(int [] nums){
        int n = nums.length;
        int [] result = new int[2*n];
        for(int i=0; i<n;i++){
            result[i] = nums[i];
            result[i+n] = nums[i];
        }
        DisplayArray.displayArray(result);
    }
    public static void main(String[] args) {
        int [] nums ={1,2,3};
        ConcatenateArray.concatenateArrayTwice(nums);
    }
}
