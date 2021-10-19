package com.kishan.easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1045;
        System.out.println(sumOfDig(n));
    }

    private static int sumOfDig(int n) {
        if (n < 10)
            return n;
        return n % 10 + sumOfDig(n / 10);
    }
}
