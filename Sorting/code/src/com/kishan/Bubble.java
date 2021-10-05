package com.kishan;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 2};
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {5,3,4,1,2};
        bubbleSort(arr);
        bubbleSort(arr1);
        bubbleSort(arr2);
        bubbleSort(arr3);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int bit;
        for (int i = 0; i < n-1; i++) {
            bit = 0;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                    bit = 1;
                }
            }
            if(bit==0)
                break;
        }

//        int n = arr.length;
//        boolean swapped;
//        for (int i = 0; i < n - 1; i++) {
//            swapped = false;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    swap(j, j + 1, arr);
//                    swapped = true;
//                }
//            }
//            if (!swapped)
//                break;
//        }

    }

    static void swap(int a, int b,int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
