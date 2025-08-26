
package com.gathipay.recursion;

public class StaticVariableInRecursion {

    static int x = 0;
    static int staticVariableInRecursion(int num){
        if(num > 0){
           x++;
           return staticVariableInRecursion(num-1) +x;
        }
        return 0;
    }

     public static void main(String[] args) {  
        int X= 5;
        System.out.print("==> "+staticVariableInRecursion(X));
    }
}
