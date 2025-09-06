package com.gathipay.array.basic;

public class FindSecondSmallest {
    
    public static int findSecondSmallestElement(int [] nums){
        if(nums.length ==0) return -1;
        
        int smallestElement = nums[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=1; i< nums.length;i++){
            if(nums[i] < smallestElement){
                secondSmallest = smallestElement;
                smallestElement = nums[i];
            } else if(nums[i] > smallestElement && nums[i] < secondSmallest ){
                secondSmallest = nums[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        
        int [] nums ={1,2,0,-1,5,8,4,6};
        System.out.println("Second Smallest Element in the array is ::"+FindSecondSmallest.findSecondSmallestElement(nums));
    
    }
}
