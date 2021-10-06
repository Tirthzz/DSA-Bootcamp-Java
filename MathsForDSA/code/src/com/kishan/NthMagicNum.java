package com.kishan;

public class NthMagicNum {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(magicNum(n));
    }

    private static int magicNum(int n) {
        int magicN = 0;
        int base = 5;
        while (n > 0) {
            int lastBit = n & 1;
            magicN = magicN + lastBit * base;
            base = base * 5;
            n = n >> 1;
        }
        return magicN;
    }
}
