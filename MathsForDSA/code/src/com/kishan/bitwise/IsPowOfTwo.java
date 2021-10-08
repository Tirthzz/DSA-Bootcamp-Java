package com.kishan.bitwise;

public class IsPowOfTwo {
    public static void main(String[] args) {
        int n = 32; // note: if n=0 return false
        boolean ans = (n & (n - 1))== 0;
        System.out.println(ans);
    }
}
