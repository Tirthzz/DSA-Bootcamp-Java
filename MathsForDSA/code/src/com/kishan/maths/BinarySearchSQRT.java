package com.kishan.maths;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int precision = 10;
        System.out.println(sqrt(n, precision));
        System.out.printf("%.3f", sqrt(n, precision));
    }

    //Time: O(log(n))
    private static double sqrt(int n, int precision) {

        double root = 0.0;

        int s = 0;
        int e = n;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m * m == n) {
                return m;
            } else if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
                root = m;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < precision; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;

        }

        return root;
    }
}
