package com.kishan;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {4, 3, 1, 5, 2};
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {5,3,4,1,2};
        insertionSort(arr);
        insertionSort(arr1);
        insertionSort(arr2);
        insertionSort(arr3);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }
    static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j >0 ; j--) {

                if(arr[j]<arr[j-1])
                    swap(j,j-1,arr);
                else
                    break;

            }

        }

    }

    static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
