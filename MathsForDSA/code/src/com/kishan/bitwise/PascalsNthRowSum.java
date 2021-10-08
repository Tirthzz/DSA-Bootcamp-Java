package com.kishan.bitwise;

public class PascalsNthRowSum {
    public static void main(String[] args) {
        int rowNo = 6;
        int ans = 1<<(rowNo-1); // 2^(rowNo-1)
        System.out.println(ans);
    }
}
