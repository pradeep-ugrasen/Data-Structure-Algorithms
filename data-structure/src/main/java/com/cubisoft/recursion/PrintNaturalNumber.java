package com.cubisoft.recursion;

public class PrintNaturalNumber {
   
     static void printNaturalNumber(int num){

        if(num > 0){
            printNaturalNumber(num-1);
            System.out.print(num +",");
        }
    }

     public static void main(String[] args) {  
        int X = 3;
        printNaturalNumber(X);
    }
}
