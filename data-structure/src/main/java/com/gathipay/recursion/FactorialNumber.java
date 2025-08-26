package com.gathipay.recursion;

public class FactorialNumber {
    
    int result = 0;
    static int factorialNumber(int num){
        if(num == 0 || num == 1){
            return 1;
        }else{
            return factorialNumber(num-1)*num;
        }
    }

    public static void main(String[] args) {
        int x =5;
        System.out.println("Factorial of "+x+" is " + factorialNumber(x));
    }
}
