package com.kishan;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 233423;
        int base = 10;
        n = 10;
        base = 2;

        int ans = (int) (Math.log(n) / Math.log(base) + 1);
        System.out.println(ans);
    }
}
