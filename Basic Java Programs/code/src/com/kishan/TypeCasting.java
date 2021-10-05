package com.kishan;

public class TypeCasting {
    public static void main(String[] args) {

        int a = 128;
        int a1 = 255;
        int a2 = 256;
        int a3 = 257;
    byte c =  127;

        byte b = (byte) a;

        b = (byte) (b*2);

        System.out.println(b);

        byte d = 127; //1270

        System.out.println((byte) a+" "+(byte) a1+" "+(byte) a2+" "+(byte) a3);

//        float f1 = 9/5;
//        float f2 = 9.0/5;
        float f = 9.0f/5;

        System.out.println(f);

        System.out.println(32.89f * 9/5 + 32);
        System.out.println(32.89f * (9/5) + 32);


    }
}
