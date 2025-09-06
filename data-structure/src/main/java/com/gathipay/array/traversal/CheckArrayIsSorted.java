package com.gathipay.array.traversal;

public class CheckArrayIsSorted {
    
    public static boolean isSorted(int [] nums){
        for(int i=1; i<nums.length;i++){
            if(nums [i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] nums = {10,20,30,40,50};
        System.out.println("Array is sorted :: "+CheckArrayIsSorted.isSorted(nums));
    }
}
