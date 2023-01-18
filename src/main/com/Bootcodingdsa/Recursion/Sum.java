package com.Bootcodingdsa.Recursion;
public class Sum {
    private static int SumNumbers(int n){
    if (n<= 1)
            return n;
        return n + SumNumbers(n - 1);
}
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(SumNumbers(n));
    }
}












