package com.kishan;

public class OddEven {
    public static void main(String[] args) {
        int a = 24;
        System.out.println(isOdd(a));
    }

    private static boolean isOdd(int a) {
        return (a & 1) == 1;
    }
}
