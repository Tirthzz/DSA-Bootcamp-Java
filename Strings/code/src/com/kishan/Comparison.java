package com.kishan;

public class Comparison {
    public static void main(String[] args) {
        String a = "Kishan";
        String b = "Kishan";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("Kishan");
        String name2 = new String("Kishan");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}