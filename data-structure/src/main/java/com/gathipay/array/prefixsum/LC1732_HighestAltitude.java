package com.gathipay.array.prefixsum;

public class LC1732_HighestAltitude {
    
    public static int findHighestAltitude(int [] nums){
        int sum =0;
        int highestAltitude =0;
        for(int i =0;i<nums.length;i++){
            sum +=nums[i];
            if(sum > highestAltitude) {
                highestAltitude = sum;
            }
        }
        return highestAltitude;
    }

    public static void main(String[] args) {
        int nums [] = {-5,1,5,0,-7}; 
        System.out.println("Higest Altitude is :: "+ LC1732_HighestAltitude.findHighestAltitude(nums));       
    }
}
