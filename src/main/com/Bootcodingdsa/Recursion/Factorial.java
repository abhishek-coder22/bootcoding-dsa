package com.Bootcodingdsa.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 2;
        int result =getFactorialNumber(n);
        System.out.println(result);
    }
    public static int getFactorialNumber(int n){
        if(n==1){
            return 1;
        }
        return n* getFactorialNumber(n-1);
    }
}
