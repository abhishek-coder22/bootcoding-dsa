package com.Bootcodingdsa;
public class NumberOfSteps {
    public static void main(String[] args) {
        int i = 1;
        int NumberOfSteps = 0;
        int count = i;
        int n = 13;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            count++;
            System.out.println(count);
        }
    }
}



