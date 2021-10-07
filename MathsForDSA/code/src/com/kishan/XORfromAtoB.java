package com.kishan;

public class XORfromAtoB  // RangeXOR
{
    public static void main(String[] args) {
        // range xor for a, b = xor(b) ^ xor(a-1)
        int a = 3;
        int b = 9;
        System.out.println(xorFromAtoB(a, b));

        // only for check, will give TLE for large numbers
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 = ans2 ^ i;
        }
        System.out.println(ans2);
    }

    private static int xorFromAtoB(int a, int b) {
        int ans = xorFrom0tillN(b) ^ xorFrom0tillN(a - 1);
        return ans;
    }

    // this gives xor from 0 to a
    private static int xorFrom0tillN(int N) {
        int ans;
        if (N % 4 == 0)
            ans = N;
        else if (N % 4 == 1)
            ans = 1;
        else if (N % 4 == 2)
            ans = N + 1;
        else // (N%4==3)
        {
            ans = 0;
        }
        return ans;
    }
}
