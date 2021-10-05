package com.kishan;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 2};
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {5, 3, 4, 1, 2};
        int[] arr4 = {3,5,2,1,4};
        cyclicSort(arr);
        cyclicSort(arr1);
        cyclicSort(arr2);
        cyclicSort(arr3);
        cyclicSort(arr4);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }

    public static void cyclicSort(int[] arr) {
        int n = arr.length;
//        for (int i = 0; i < n; ) // try 4 3 1 5 2
//        {
//            if (arr[i] != (i + 1))
//                swap(i, arr[i] - 1, arr);
//            else
//                i++;
//        }
        int i = 0;
        while(i<n){
            int correctIdx = arr[i]-1;
            if (arr[i] != arr[correctIdx])
                swap(i, correctIdx, arr);
            else
                i++;
        }
    }

    static void swap(int first, int last, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
