package com.kishan;

import java.util.Scanner;

public class MiniCalci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float f1 = in.nextFloat();
        System.out.print("Enter second number: ");
        float f2 = in.nextFloat();
        char want;
        do{
            System.out.print("Enter any symbol (+ or * or - or /) : ");
            
            char sbl = in.next().charAt(0);
            
            if(sbl == '+'){
                System.out.println(f1+f2);
            }
            else if(sbl == '*'){
                System.out.println(f1*f2);
            }
            else if(sbl == '-'){
                System.out.println(f1-f2);
            }
            else if(sbl == '/'){
                System.out.println(f1/f2);
            }
            else{
                System.out.println("Incorrect Symbol entered");
            }

            System.out.println("Do you want to continue (y/n) ?: ");
            want = in.next().charAt(0);

        }while(want == 'y');

    }
}
