package com.gathipay.recursion;

public class NestedRecursion {
    
    static int nestedRecursion(int n){

        if(n > 100){
            return n -10;
        }else{
           return  nestedRecursion(nestedRecursion(n+11));
        }
    }

    public static void main(String[] args) {
        int x = 95;

        System.out.println(nestedRecursion(x));
    }
}
