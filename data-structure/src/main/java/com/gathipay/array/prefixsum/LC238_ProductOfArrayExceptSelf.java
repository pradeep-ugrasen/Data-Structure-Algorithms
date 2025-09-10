package com.gathipay.array.prefixsum;

import com.gathipay.array.basic.DisplayArray;

public class  LC238_ProductOfArrayExceptSelf {
    
     public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int [n];
        
        // Brute Force TC-O(n), SC-O(n)
        /*int [] prefixProductFromStart = new int [n];
        int [] prefixProductFromEnd = new int [n];
        prefixProductFromStart [0] = nums[0];
        for(int i=1; i<nums.length;i++){
            prefixProductFromStart[i] = nums[i] *prefixProductFromStart[i-1];
        }

        prefixProductFromEnd[n-1] = nums[n-1];
         for(int i=n-2; i>=0;i--){
            prefixProductFromEnd[i] = nums[i] *prefixProductFromEnd[i+1];
        }
        
        result[0] = prefixProductFromEnd[1];
        result[n-1] = prefixProductFromStart[n-2];

        for(int i=1; i<n-1;i++){
           result[i] = prefixProductFromStart[i-1] * prefixProductFromEnd[i+1]; 
        }*/

        int productOfAllBeforeCurrent =1;
        int productOfAllAfterCurrent =1;

        for(int i =0; i<n; i++){
            result[i] = productOfAllBeforeCurrent;
            productOfAllBeforeCurrent *= nums[i];

        }

         for(int i =n-1; i>=0; i--){
            result[i] *= productOfAllAfterCurrent;
            productOfAllAfterCurrent *= nums[i];

        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums ={1,2,3,4};
        int [] result = LC238_ProductOfArrayExceptSelf.productExceptSelf(nums);
        DisplayArray.displayArray(result);
    }
}
