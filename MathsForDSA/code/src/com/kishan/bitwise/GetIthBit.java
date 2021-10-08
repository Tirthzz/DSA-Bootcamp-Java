package com.kishan.bitwise;

public class GetIthBit {
    public static void main(String[] args) {
        int num = 46; //101110
        int i = 3;
        System.out.println(findIthBit(num,i));
    }

    private static int findIthBit(int num, int i) {
//        return (num>>(i-1))&1;

        // Concept of masking
        int maskedNum = 1<<(i-1);
//        return num&maskedNum;
        return (num&maskedNum)>>(i-1);
    }
}
