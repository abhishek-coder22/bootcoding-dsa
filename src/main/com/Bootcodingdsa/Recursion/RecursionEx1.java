package com.Bootcodingdsa.Recursion;

public class RecursionEx1 {

    public static void main(String[] args) {
        int n = 10;
    print(n-1);

    }
        public static void print ( int n){
            if (n == 0) {
                return;
            }
            print(n - 1);
            System.out.println(n);
        }
    }

