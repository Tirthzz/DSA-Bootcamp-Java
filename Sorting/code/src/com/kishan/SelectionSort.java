package com.kishan;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {4, 3, 1, 5, 2};
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {5,3,4,1,2};
        selectionSort(arr);
        selectionSort(arr1);
        selectionSort(arr2);
        selectionSort(arr3);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }

    static void selectionSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {


            int last = n - i - 1;
            int maxIdx = getMaxIndex(0, last, arr);
            swap(maxIdx, last, arr);

        }

    }

    public static int getMaxIndex(int start, int last, int[] arr) {
        int mxIdx = start;
        for (int i = start; i <= last; i++) {

            if (arr[i] > arr[mxIdx]) {
                mxIdx = i;
                // here you can set a bit if you want to check that mxIdx is modified or not and if not modified then return -1 with mxIdx in last in the form of array as [mxIdx,bit] and check
                // if arr[1] == -1 then array is sorted and break the loop then and there
            }

        }
        return mxIdx;
    }

    static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
