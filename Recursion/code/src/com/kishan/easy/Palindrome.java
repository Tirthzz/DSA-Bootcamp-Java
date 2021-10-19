package com.kishan.easy;

public class Palindrome {
    private static int sum;
    private static void revNum1(int n) {
        if (n == 0)
            return;
        sum = n % 10 + sum * 10;
        revNum1(n / 10);
    }
    public static void main(String[] args) {
        int n = 21312;
        System.out.println(checkPalindrome(n));
    }

    private static boolean checkPalindrome(int n) {
        return n == revNum2(n);
    }

    private static int revNum2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n < 10)
            return n;
        return (n % 10 * (int) Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

}
