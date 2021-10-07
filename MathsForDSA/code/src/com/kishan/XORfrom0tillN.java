package com.kishan;

public class XORfrom0tillN {
    public static void main(String[] args) {
        // XOR of Numbers from 0 till N
//        int N = 7;
        System.out.println(xorFrom0tillN(0));
        System.out.println(xorFrom0tillN(1));
        System.out.println(xorFrom0tillN(2));
        System.out.println(xorFrom0tillN(3));
        System.out.println(xorFrom0tillN(4));
        System.out.println(xorFrom0tillN(5));
        System.out.println(xorFrom0tillN(6));
        System.out.println(xorFrom0tillN(7));
        System.out.println(xorFrom0tillN(8));
        System.out.println(xorFrom0tillN(9));
        System.out.println(xorFrom0tillN(10));
        System.out.println(xorFrom0tillN(11));
        System.out.println(xorFrom0tillN(12));


    }

    private static String xorFrom0tillN(int N) {
        String ans;
        if (N % 4 == 0)
            ans = "N: "+N;
        else if (N % 4 == 1)
            ans = 1+"";
        else if (N % 4 == 2)
            ans = "N+1: "+(N + 1);
        else // (N%4==3)
        {
            ans = 0+"";
        }
        return ans;
    }
}
