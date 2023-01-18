package com.Bootcodingdsa.Recursion;
import static com.Bootcodingdsa.Recursion.RecursionEx1.print;
public class NaturalNumber {
    public static void main(String[] args) {
        int n =10;
        print(n);
    }
    private static void printNaturalNumber(int n){
        if(n==0){
            return;
        }
        if(n%2==0){
            System.out.println(n);
        }
    }
}
