package com.kishan;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = in.nextInt();
        int fact = 1;
    while (num>1){
        fact = fact * num;
        num--;
    }
        System.out.println(fact);
    }
}
