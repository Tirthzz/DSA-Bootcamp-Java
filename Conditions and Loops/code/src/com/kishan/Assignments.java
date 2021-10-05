package com.kishan;

import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
        // do while

//            do {
//                // body
//            } while (condition);

        Scanner input = new Scanner(System.in);

        float r = 1.2f;
        float base = 8;
        float h = 2.4f;
        float w = 2;
        float l = 2.4f;
        float side = 5;

        //        1
        System.out.println(Math.PI * r * r);
//        2
        System.out.println(1 / 2.0 * base * h);
//        3
        System.out.println(w * l);
//        4
        double ht = Math.sqrt(side * side - base * base / 4.0);
        System.out.println("height= " + ht);
        System.out.println(1 / 2.0 * base * ht);
//        5
        System.out.println(base * h);

//        Intermediate Java Programs
//        7 Power fn Java -
//        https://www.geeksforgeeks.org/math-pow-method-in-java-with-example/

//        8 Deprecation Program

        int amount = 100000;
        float depPer = 10;
        int yr = 3;
        float temp = amount;

        for (int i = 0; i < yr; i++) {

            temp = temp - depPer / 100 * temp;

        }

        System.out.println(temp);

        // Inputs through Command line Arguments
//
//        long amount,deppercent,year,afterdep,temp;
//        amount=Long.parseLong(arg[0]);
//        deppercent=Long.parseLong(arg[1]);
//        year=Long.parseLong(arg[2]);
//        System.out.println("amount is = "+arg[0]);
//        System.out.println("Depreciation percent = "+arg[1]);
//        System.out.println("number of years = "+arg[2]);
//
//        temp=amount;
//        for(int i=0;i<year;i++)
//            temp=((100-deppercent)*temp)/100;
//        System.out.println("after depreciation = "+temp);

        // 9 Batting Average

//        long Matches,runs,innings,notout;
//
//        double avg;
//
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("enter the number of matches played");
//
//        Matches=sc.nextLong();
//
//        while(true)
//        {
//            System.out.println("enter the number innings batted");
//
//            innings=sc.nextLong();
//
//            if(innings<=Matches)
//                break;
//
//            System.out.println("enter the number innings batted correctly <=matches");
//
//        }
//
//
//        while(true)
//        {
//
//            System.out.println("enter number of times notout");
//
//            notout=sc.nextLong();
//
//            if(notout<=innings)
//                break;
//
//            System.out.println("enter the number times became notout correctly <=innings");
//        }
//
//        System.out.println("enter runs scored");
//
//        runs=sc.nextLong();
//
//        if(innings==notout)
//            avg=runs;
//        else
//            avg=runs/(innings-notout);
//
//        System.out.println("batting average="+avg);


        // 17 Reverse String Program
        String s = "kishan";
        String sR = "";

        int len = s.length();

        while (len != 0) {
            sR += s.charAt(len - 1);
            len--;
        }

        System.out.println(sR);

//        20,21 HCF LCM Programs

        int a = input.nextInt();
        int b = input.nextInt();
        int mn = Math.min(a, b);
        int hcf = 1;
//        int rem;
//        do{
//            rem = mx%mn;
//            mx = mn;
//            mn = rem;
//        }while(rem!=0);

        for (int i = 2; i <= mn / 2; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF= " + hcf);

        int mx = Math.max(a, b);

        while (true) {
            if (mx % a == 0 && mx % b == 0) {
                break;
            }
            mx++;
        }

        System.out.println("LCM= "+mx);

        // interesting one

//        int a =(x > y)? x : y;
//        for(i = a ; i <= x*y ; i = i + a)
//        {
////returns true if both conditions are true
//            if(i % x == 0 && i % y == 0)
//                break;
//        }

        int i;
        for(i = mx ; i <= a*b ; i = i + mx)
        {
//returns true if both conditions are true
            if(i % a == 0 && i % b == 0) {
                break;
            }
        }

        System.out.println("LCM= "+i);

        for(i = mx ; i <= a*b ; i = i + mx)
        {
//returns true if both conditions are true
            if(i % mn == 0) {
                break;
            }
        }

        System.out.println("LCM= "+i);

        // 23 Perfect Number
        int num = input.nextInt();
        int sum = 0;
        for (int j = 1; j <=num/2 ; j++) {
            if(num%j==0)
                sum+=j;
        }
        if(sum==num)
            System.out.println("It's a Perfect Number");
        else
            System.out.println("It's not a Perfect Number");
    }
}
