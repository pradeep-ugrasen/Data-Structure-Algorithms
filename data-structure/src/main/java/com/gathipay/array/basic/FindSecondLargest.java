package com.gathipay.array.basic;

public class FindSecondLargest {
    
        public static int findSecondLargestElement( int [] nums){
        if(nums.length == 0) return 0;

        int largestElement = nums[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i =1; i< nums.length; i++){
            if(nums[i] > largestElement){
                secondLargest = largestElement; 
                largestElement = nums[i];
            }else if( nums[i] < largestElement && nums[i] >secondLargest){
                secondLargest = nums[i]; 
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int [] nums ={1,2,0,-1,5,8,4,6};
        System.out.println("Second Largest Element in the array is ::"+FindSecondLargest.findSecondLargestElement(nums));
    }
}
