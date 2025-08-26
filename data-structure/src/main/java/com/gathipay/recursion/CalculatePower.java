package com.gathipay.recursion;

public class CalculatePower {

    static int calculatePower(int m , int n){
        if(n ==0){
            return 1;
        }else{
            return calculatePower(m, n-1) *m;
        }
    }

     static int pow(int m , int n){
        if(n ==0){
            return 1;
        }

        if(n % 2 ==0){
            return pow(m*m, n/2);
        }else{
              return m * pow(m*m, (n-1)/2);
        }
    }

    public static void main(String[] args) {
        int m = 2; 
        int n = 9;
        //System.out.println("Power of (" + m + ""+ n+") is :: "+ calculatePower(m,n));

        System.out.println("Power of (" + m + ""+ n+") is :: "+ pow(m,n));
    }
}