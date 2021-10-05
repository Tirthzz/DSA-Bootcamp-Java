package com.kishan;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("");
        StringBuilder builder1 = new StringBuilder("kishan");
        StringBuilder builder2 = new StringBuilder();
//        System.out.println(builder1);
        for (int i = 0; i < 26; i++) {

//            char ch = 'a'+1;
//            char ch = 'a'+i;
            char ch = (char)('a'+i);
            builder.append(ch);
        }
            char ch = 'a'+1;
        System.out.println(ch);
        System.out.println(builder);
        System.out.println(builder.toString());

        builder.reverse();
        System.out.println(builder);
        System.out.println(builder1);
//        builder1.sout

    }
}
