package com.kishan.bitwise;

public class FindUniqueEven {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 9, 2, 3};
        System.out.println(uniqueEle(arr));

    }

    private static int uniqueEle(int[] arr) {
        int ans = 0;
        for (int j : arr) {
            ans = ans ^ j;
        }
        return ans;
    }
}
