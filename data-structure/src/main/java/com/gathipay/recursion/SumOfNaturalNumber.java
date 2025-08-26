package com.gathipay.recursion;

public class SumOfNaturalNumber {
    
    static int sumOfNaturalnumber(int num){
        if(num == 0){
            return 0;
        }else{
            return sumOfNaturalnumber(num-1)+num;
        }
    }

    public static void main(String[] args) {
        int x =5;
        System.out.println("Sum of "+x+" Natural Number " + sumOfNaturalnumber(x));
    }
}
