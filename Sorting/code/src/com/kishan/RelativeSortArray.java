package com.kishan;

import java.util.Arrays;
import java.util.Locale;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};

        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] hashArr = new int[1001];
        for (int j : arr1) {
            hashArr[j]++;
        }
        int[] ans = new int[n];
        int idx = 0;
        for (int i = 0; i < m; i++) {
            while (hashArr[arr2[i]]-- != 0) {
                ans[idx] = arr2[i];
                idx++;
            }
            hashArr[arr2[i]]=0;
        }

        for(int i=0; i<1001;i++){

            while(hashArr[i]--!=0){
                ans[idx] = i;
                idx++;
            }
        }

        return ans;


    }
}
