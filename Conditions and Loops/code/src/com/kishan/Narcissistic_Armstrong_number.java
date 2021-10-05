package com.kishan;

public class Narcissistic_Armstrong_number {
    public static void main(String[] args) {
//        For example, the number 153 in base b=10 is a Narcissistic/Armstrong/PlusPerfect number, because k (no. of digits) =3 and 153 = 1^3 + 5^3 + 3^3

//        int n1 = 370;
        int n1 = 1634;

        int temp = n1;
        int sum = 0;

        int no_of_digits=0;
        while(temp>0){
            no_of_digits++;
            temp/=10;
        }

        temp = n1;
        while (temp>0){

            sum+= Math.pow(temp%10,no_of_digits);

            temp/=10;

        }

        if (sum == n1){
            System.out.println("An Armstrong number");
        }
        else{

            System.out.println("Not an Armstrong number");
        }






    }
}
