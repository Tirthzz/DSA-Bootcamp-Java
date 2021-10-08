package com.kishan.bitwise;

public class ResetIthBit {
    public static void main(String[] args) {
        int num = 46; //101110
//        int i = 4; // 100110
//        int i = 5; //101110
        int i = 6; // 001110
        System.out.println(resetIthBit(num, i));
    }

    private static int resetIthBit(int num, int i) {
        int supplementaryMask = num|1;
        int maskedNum = 1 << (i - 1);
        int finalMaskedNum = maskedNum^supplementaryMask;
        return num&finalMaskedNum;

    }
}
