package com.kishan;

import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in Rupees: ");
        float inr = input.nextFloat();

        System.out.println("Amount in Dollar= "+inr*0.013f);
    }
}
