package com.gathipay.recursion;

public class HeadRecursion {
   
     static void printNaturalNumber(int num){

        if(num > 0){
            printNaturalNumber(num-1); 
            System.out.print(num +",");// this is callled head recursion
        }
    }

     public static void main(String[] args) {  
        int X = 3;
        printNaturalNumber(X);
    }
}
