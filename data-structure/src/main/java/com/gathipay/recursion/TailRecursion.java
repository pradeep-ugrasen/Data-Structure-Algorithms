package com.gathipay.recursion;

public class  TailRecursion {
    
    static void printNaturalNumberReverse(int num){

        if(num > 0){
            System.out.print(num +","); // this is callled tail recursion
            printNaturalNumberReverse(num-1);
        }
    }

     public static void main(String[] args) {  
        int X = 3;
        printNaturalNumberReverse(X);
    }
}