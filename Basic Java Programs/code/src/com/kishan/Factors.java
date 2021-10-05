package com.kishan;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");





        int num = input.nextInt();
    int a = 1;
        while (a <= num/2){
            System.out.print((num%a==0)?a+" ":"");
            a++;
        }

        System.out.println(num);
    }
}
