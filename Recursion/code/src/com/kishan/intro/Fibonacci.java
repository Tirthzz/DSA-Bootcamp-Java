package com.kishan.intro;

public class Fibonacci {

    public static void main(String[] args) {
//        int ans = Fibo(4);
//        System.out.println(ans);
        System.out.println(Fibo(4));
    }

    static int Fibo(int n) {
        if (n < 2)
            return n;
        return Fibo(n - 1) + Fibo(n - 2);
    }
}
