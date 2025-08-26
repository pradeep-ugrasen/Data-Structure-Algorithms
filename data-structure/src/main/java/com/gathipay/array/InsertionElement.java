package com.gathipay.array;

public class InsertionElement{
    
    static int linerSearch(int [] nums, int k){

        for(int i =0; i<nums.length;i++){
           if(nums[i] == k) {
            return i;
           } 
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = new int[4];
        arr[0]=1;
        arr[1]=2;
        int k =0;
        System.out.println("Result :: "+ linerSearch(arr, k));
    }
}
