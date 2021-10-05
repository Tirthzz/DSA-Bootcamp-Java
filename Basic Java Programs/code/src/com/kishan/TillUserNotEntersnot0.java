package com.kishan;

import java.util.Scanner;

public class TillUserNotEntersnot0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float sum = 0;
        float f;
        while((f=in.nextFloat()) != 0){
            sum += f;
            // for the assignment's 10th ques (print the largest among the numbers entered)
//            if(f>sum){
//                sum=f;
//            }
        }
        System.out.println(sum);

    }
}
