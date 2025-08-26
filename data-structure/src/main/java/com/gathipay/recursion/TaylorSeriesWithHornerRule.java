package com.gathipay.recursion;

public class TaylorSeriesWithHornerRule {
     static double sum =1; 

     static double taylorSeries(int x, int n){
        if(n == 0 ){
            return sum;
        }else{
            sum = (double) 1+x*sum/n;
            return taylorSeries(x, n-1);
        }
    }

     public static void main(String[] args) {
        int e=3;
        int x=10;
        
        System.out.println("Taylor Series Of ("+ e + ","+x+" ) is ::"+taylorSeries(e, x));
    }
}
