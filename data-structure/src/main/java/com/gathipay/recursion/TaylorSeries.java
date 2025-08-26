package com.gathipay.recursion;

public class TaylorSeries {
    
    static int p =1;
    static int f =1;

    static double taylorSeries(int x, int n){
        if(n == 0 ){
            return 1;
        }else{
            double result = taylorSeries(x, n-1);
            p = p*x;
            f = f*n;
            return result + (double) p/f;
        }
    }

    public static void main(String[] args) {
        int e=3;
        int x=10;
        
        System.out.println("Taylor Series Of ("+ e + ","+x+" ) is ::"+taylorSeries(e, x));
    }
}
