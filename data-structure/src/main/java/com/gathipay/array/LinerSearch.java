package com.gathipay.array;

public class LinerSearch {
   
    static int linerSearch(int [] nums, int k){
        for(int i =0; i<nums.length;i++){
           if(nums[i] == k) {
            return i;
           } 
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,4,6,5,7,8};
        int k =5;
        System.out.println("Result :: "+ linerSearch(arr, k));
    }
}
