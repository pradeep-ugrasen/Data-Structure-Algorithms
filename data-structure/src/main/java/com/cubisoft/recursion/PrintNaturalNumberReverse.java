package com.cubisoft.recursion;

public class  PrintNaturalNumberReverse {
    
    static void printNaturalNumberReverse(int num){

        if(num > 0){
            System.out.print(num +",");
            printNaturalNumberReverse(num-1);
        }
    }

     public static void main(String[] args) {  
        int X = 3;
        printNaturalNumberReverse(X);
    }
}