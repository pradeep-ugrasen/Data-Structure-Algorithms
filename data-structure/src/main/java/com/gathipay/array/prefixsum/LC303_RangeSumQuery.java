package com.gathipay.array.prefixsum;

public class LC303_RangeSumQuery {

    private  int [] prefixsum;

    /* Brute force approach 
    public  LC303_RangeSumQuery(int [] nums){
        this.prefixsum = nums;
    }
    public  int sumRange(int i, int j){
        int sum =0;
        for(int k =i; k <=j; k++){
            sum += prefixsum[k];
        }
        return sum;
    }
    */

     /* Optimal Approach */
    public  LC303_RangeSumQuery(int [] nums){
        for(int i =1; i < nums.length-1; i++){
           nums [i] += nums[i-1]; 
        }
        this.prefixsum = nums;
    }

    public  int sumRange(int left, int right){
      if(left == 0){
         return prefixsum[right];
      }

      return  prefixsum[right] - prefixsum[left -1];
    }

    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5,6};
        LC303_RangeSumQuery lRangeSumQuery = new LC303_RangeSumQuery(nums);

        System.out.println("Sum of range =>"+ lRangeSumQuery.sumRange(1, 2) );
    }
}
