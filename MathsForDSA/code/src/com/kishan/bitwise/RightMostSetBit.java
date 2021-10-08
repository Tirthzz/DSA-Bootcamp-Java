package com.kishan.bitwise;

public class RightMostSetBit {
    public static void main(String[] args) {
        byte N = 108;// 0110 1100
        System.out.println(rightMostSetBit(N));
    }

    private static int rightMostSetBit(byte N) {
        int complimentVar = N|1;
        int compliment = N^complimentVar;//1's Compliment 1001 0011
        int ans = compliment+1;// 2's Compliment 1001 0100
//        -N = 2's Compliment of N 
        return N&(-N); // gives the rightmost set bit (by observation)
    }
}
