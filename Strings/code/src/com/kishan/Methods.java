package com.kishan;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = " Kishan Bagga Hello World";
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Kishan   Bagga           ");
        System.out.println("     Kishan   Bagga      ".strip());
        System.out.println("     Kishan   Bagga      ".trim());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}