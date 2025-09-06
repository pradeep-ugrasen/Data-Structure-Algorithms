package com.gathipay.array.basic;

public class FindLargestElement {
    
    public static int findLargestElement( int [] nums){
        if(nums.length == 0) return 0;

        int largestElement = nums[0];
        for(int i =1; i< nums.length; i++){

            if(nums[i] > largestElement){
                largestElement = nums[i];
            }
        }
        return largestElement;
    }

    public static void main(String[] args) {
        int [] nums ={1,2,0,-1,5,8,4,6};
        System.out.println("Largest Element in the array is ::"+FindLargestElement.findLargestElement(nums));
    }
}
