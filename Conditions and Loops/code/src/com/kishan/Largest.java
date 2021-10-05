package com.kishan;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();


        float max = Math.max(c, Math.max(a, b));

        // Q: Find the largest of the 3 numbers
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }

//        int max = 0;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if (c > max) {
//            max = c;
//        }



        System.out.println(max);
    }
}
