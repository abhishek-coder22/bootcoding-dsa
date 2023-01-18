package com.Bootcodingdsa.Recursion;
import java.util.Scanner;
//WAP to count the digits of a given number using recursion
public class Digits {
    public static void main(String[] args) {
        int n=0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.close();
        System.out.print(CountDigits(n / 10));
    }
    public static int CountDigits(int n) {
        if (n == 0)
            return 1;
        else {
            return 1 + CountDigits(n / 10);
        }
    }
}

