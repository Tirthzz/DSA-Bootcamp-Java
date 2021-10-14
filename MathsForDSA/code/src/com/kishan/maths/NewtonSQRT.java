package com.kishan.maths;

public class NewtonSQRT {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(sqrt(n));
    }

    private static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = (x + (n / x)) / 2;
            double error = Math.abs(root - x);
            if (error < 0.01) // error<1
            {
                break;
            }
            x = root;
        }
        return root;
    }
}
