package com.Bootcodingdsa.Recursion;

public class CountDigits {
    public static void main(String[] args) {
        int n =1123464;
        System.out.println(countdigit(n));
    }
    public static int countdigit(int n){
        if(n<10) {
            return 1;
        }
        return 1+ countdigit(n/10);
        }
    }
 // for count digit
// return n%10+ countdigit(n/10)
