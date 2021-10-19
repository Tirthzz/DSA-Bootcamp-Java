package com.kishan.easy;

public class RevNum {

    public static void main(String[] args) {
        int n = 1245;
        System.out.println("RevNum1");
        System.out.println(sum);
        revNum1(n);
        System.out.println(sum);

        System.out.println("RevNum2");
        System.out.println(revNum2(n));

    }

    private static int revNum2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n<10)
            return n;
        return (n % 10 * (int) Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static int sum;
    private static void revNum1(int n) {
        if (n == 0)
            return;
        sum = n % 10 + sum * 10;
        revNum1(n / 10);
    }


}
