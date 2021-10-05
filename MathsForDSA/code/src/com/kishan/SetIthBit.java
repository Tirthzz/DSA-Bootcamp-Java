package com.kishan;

public class SetIthBit {
    public static void main(String[] args) {
        int num = 46; //101110
        int i = 5; //111110
        System.out.println(setIthBit(num,i));
    }

    private static int setIthBit(int num, int i) {
        int maskedNum = 1<<(i-1);
        return num|maskedNum;
    }
}
