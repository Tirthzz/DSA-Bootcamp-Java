package com.kishan;

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        System.out.println(power(base, power));
    }

    private static int power(int base, int power) {
        int ans = 1;
        while (power > 0) {
            if ((power & 1) == 0)
                ans = ans * base;
            base = base * base;
            power = power >> 1;
        }
        return ans;
    }
}
