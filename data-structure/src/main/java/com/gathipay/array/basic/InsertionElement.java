package com.gathipay.array.basic;

public class InsertionElement{
    
    static int insertionNewElement(int [] nums, int element, int index, int length, int capacity){
        
        if(length < capacity){
            // Shift elements to the right to make space for the new element
            for(int i = length-1; i >= index; i--){
                nums[i + 1] = nums[i];
            }
        
            // Insert the new element at the specified index
            nums[index] = element;
            return length + 1; // Return the new length after insertion
        } else {
            return length; // If there's no space, return the current length
        }  
    }     
        

    public static void main(String[] args) {
        int [] arr = new int[7];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=5;

        int k =4;
        System.out.println("New Length :: "+ insertionNewElement(arr, k, 3,4,7));
    }
}
