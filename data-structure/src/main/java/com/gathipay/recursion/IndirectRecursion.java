package com.gathipay.recursion;

public class IndirectRecursion {
    
    static void funA(int n){
        if(n > 0){
            System.out.print(n+" ");
            funB(n-1);
        }
    }

    static void funB(int n){
        if(n > 0){
            System.out.print(n+" ");
            funA(n/2);
        }
    }
    public static void main(String[] args) {
    
        int x=20;
        funA(x);

    }
}
