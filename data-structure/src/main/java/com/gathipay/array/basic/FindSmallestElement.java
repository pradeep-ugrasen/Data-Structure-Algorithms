package com.gathipay.array.basic;

public class FindSmallestElement {
    
    public static int findSmallestElement(int [] nums){
        if(nums.length ==0) return 0;
        
        int smallestElement = nums[0];
        for(int i=1; i< nums.length;i++){
            if(nums[i] < smallestElement){
                smallestElement = nums[i];
            }
        }
        return smallestElement;
    }
    public static void main(String[] args) {
        
        int [] nums ={1,2,0,-1,5,8,4,6};
        System.out.println("Smallest Element in the array is ::"+FindSmallestElement.findSmallestElement(nums));
    
    }
}
