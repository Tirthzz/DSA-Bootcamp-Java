package com.kishan.patterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {23, 12, 9, 33, -12, -7};
        int n = arr.length;
        int i = n - 1;
        int j = 0;
        int max = 0;
        selectionSort(arr, i, j, max);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int i, int j, int max) {

        if (i == 0)
            return;
        if (j < i) {
            if (arr[max] < arr[j + 1])
                max = j + 1;
            selectionSort(arr, i, j + 1, max);
        } else {
            swap(arr, max, i);
            max = 0;
            j = 0;
            selectionSort(arr, i - 1, j, max);
        }


    }

    public static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
