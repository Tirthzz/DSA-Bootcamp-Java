package com.kishan.maths;

public class GCD_LCM {
    public static void main(String[] args) {
//        int a = 24;
//        int b = 9;
        int a = 3;
        int b = 7;
        System.out.println("HCF/GCD : "+gcd(a, b));
        System.out.println("LCM : "+lcm(a,b));
    }
    //   Assuming a<b 
//    if a>b then in the 2nd Recursive call it'll get corrected for the upcoming recursive calls
//    eg: 36,24 --> 24%36 = 24 will become 24,36 in the 2nd Recursive call

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
        // return gcd( largeNum%smallNum , smallNum(which divided the largeNum completely in the 2nd last Recursive call)
        // eg: 0,42 or 21,42 or 2,12 or 5,7 or 9,12
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
