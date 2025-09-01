package com.gathipay.array.twopointer;

public class LC11_ContainerWithMostWater {
 
    public static int containWithMostWater(int [] height){
        int left =0;
        int right = height.length -1;
        int maxArea =0;

        while(left <= right){
            int width = right -  left;
            int minArea = Math.min(height[left], height[right]);
            int area = minArea * width;
            maxArea = Math.max(maxArea, area);

            if(height[left]  < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int [] nums={1,8,6,2,5,4,8,3,7};

        System.out.println("Max Water Contain :: "+ LC11_ContainerWithMostWater.containWithMostWater(nums));
    }
}
