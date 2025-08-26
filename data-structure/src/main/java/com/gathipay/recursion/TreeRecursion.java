package com.gathipay.recursion;

public class  TreeRecursion {
    
    static void treeRecursion(int num){

        if(num > 0) {
            System.out.print(num +",");
            treeRecursion(num-1);
            treeRecursion(num-1);
        }
    }

    public static void main(String[] args) {  
        int X = 3;
        treeRecursion(X);
    }
}