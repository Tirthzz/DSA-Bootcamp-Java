package com.kishan.patterns;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {23, 12, 9, 33, -12, -7};
        int n = arr.length;
        int i = n - 1;
        int j = 0;
        bubbleSort(arr, i, j);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int i, int j) {

        if (i == 0)
            return;
        if (j < i) {
            if (arr[j] > arr[j + 1])
                swap(arr, j, j + 1);
            bubbleSort(arr, i, j + 1);
        } else {
            j = 0;
            bubbleSort(arr, i - 1, j);
        }


    }

    public static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
