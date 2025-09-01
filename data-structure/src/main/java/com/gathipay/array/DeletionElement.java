package com.gathipay.array;

public class DeletionElement {
    
    public static int deletionElement(int [] nums, int element){
        int idx = -1;
        int n = nums.length;
        
        for(int i =0; i< n-1;i++){
            if(nums[i] == element){
                idx = i;
                break;
            }
        }
        if(idx >= 0) {
            for(int i = idx; i < n-1; i++){
                nums[i] = nums[i + 1];
            }
        }else{
            return n;
        }

        // Return the new logical length after deletion
        return n - 1;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,5,4,6,7};
        int k=6;

        System.out.println("Result = "+DeletionElement.deletionElement(nums, k));
    }
}
