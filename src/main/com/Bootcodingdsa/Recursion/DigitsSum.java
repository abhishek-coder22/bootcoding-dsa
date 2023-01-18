package com.Bootcodingdsa.Recursion;

public class DigitsSum {
    public static void main(String[] args) {
        int n =22;
        int result = SumDigits(n);
        System.out.println(result);
    }
    public static int SumDigits(int n){
        if(n<10){
            return n;
        }
        return n%10 + SumDigits(n/10);
    }

}
