package com.kishan;

public class Palin {
    public static void main(String[] args) {
        String str = "abccba";
        String str1 = null;
        String                       str2 = "";
        String str3; //unused variable
//        String str3="";
        System.out.println("isPalindrome: "+isPalindrome(str));
        // all the comments,tabs are removed while generating .class file
        /* by the Lexical Analyzer
        present in Compiler
         */
    }

    // fun for checking if a string is palindrome or not
    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end)
                return false;
        }
        return true;
    }
}
