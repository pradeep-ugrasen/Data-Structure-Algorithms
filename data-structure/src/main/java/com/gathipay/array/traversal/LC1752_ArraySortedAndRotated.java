package com.gathipay.array.traversal;

public class LC1752_ArraySortedAndRotated {
    
    public static boolean isSortedAndRotated(int [] nums){
        int n = nums.length;
        int count =0;

        for(int i = 0; i<n;i++){
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <=1;
    }

    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2};
        System.out.println("Array is sorted and rotated :: "+LC1752_ArraySortedAndRotated.isSortedAndRotated(nums));
    }
}
