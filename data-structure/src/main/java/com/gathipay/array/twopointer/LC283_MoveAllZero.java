package com.gathipay.array.twopointer;

public class LC283_MoveAllZero {

     public static void moveZero(int [] nums){
        int count =0;
        for(int i =0; i<nums.length;i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }

        while (count < nums.length) {
            nums[count] = 0;
            count++;
        }

        // Display
        for(int i =0; i<nums.length;i++){
            System.out.print(nums[i]+" ,");
        }
    }

    public static void moveAllZero(int [] nums){
        int left = 0;
        for(int right =0; right<nums.length; right++){
            if(nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                 left++;
            }
        }

        // Display
        for(int i =0; i<nums.length;i++){
            System.out.print(nums[i]+" ,");
        }
    }

    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12,0};
        LC283_MoveAllZero.moveAllZero(nums);
    }
}