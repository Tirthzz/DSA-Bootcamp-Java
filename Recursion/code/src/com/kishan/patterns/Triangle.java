package com.kishan.patterns;

public class Triangle {
    public static void main(String[] args) {
        int r = 4;
        int c = 0;
        System.out.println("triangle1");
        triangle1(r, c);
        System.out.println("triangle2");
        triangle2(r, c);

    }

    private static void triangle1(int r, int c) {
        if (r == 0)
            return;
        if (c < r) {
            System.out.print("* ");
            triangle1(r, c + 1);
        } else {
            c = 0;
            System.out.println();
            triangle1(r - 1, c);
        }
    }

    private static void triangle2(int r, int c) {
        if (r == 0)
            return;
        if (c < r) {
            triangle2(r, c + 1);
            System.out.print("* ");
        } else {
            c = 0;
            triangle2(r - 1, c);
            System.out.println();
        }
    }

}
