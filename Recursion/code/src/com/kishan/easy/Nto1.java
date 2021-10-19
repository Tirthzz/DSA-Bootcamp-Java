package com.kishan.easy;

public class Nto1 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(n + " to " + 1);
        fun(n);
        System.out.println(1 + " to " + n);
        funRev(n);
        System.out.println(n + " to " + 1 + " and " + 1 + " to " + n);
        funBoth(n);
        System.out.println("CONCEPT");
        concept(n);
    }

    private static void concept(int n) {
        if(n==0)
            return;
        System.out.println(n);
//        n-- vs --n
//        concept(n--); // infinite recursion
        concept(--n);
    }


    private static void fun(int i) {
        if (i == 0) {
            return;
        }
        System.out.println(i);
        fun(i - 1);
    }

    private static void funRev(int i) {
        if (i == 0) {
            return;
        }
        funRev(i - 1);
        System.out.println(i);
    }

    private static void funBoth(int i) {
        if (i == 0) {
            return;
        }
        System.out.println(i);
        funBoth(i - 1);
        System.out.println(i);
    }
}
