package com.Bootcodingdsa.Recursion;
public class EvenNumber {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
    public static void print(int n) {
            if (n == 0) {
                return;
            }
            print(n-1);
            if(n%2==0){
                System.out.println(n);
            }
        }
}
