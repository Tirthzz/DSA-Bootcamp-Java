package com.kishan;

public class Leetcode1608 {
    public static void main(String[] args) {
        System.out.println(specialArray(new int[]{0,4,3,0,4}));
    }

    public static int specialArray(int[] arr) {
        bubbleSort(arr);

        for (int i = 1; i <= 100; i++) {
            int index = bSFirstOccurrence(i, arr);
            if (i == (arr.length - index))
                return i;
        }
        return -1;


        // int count;
        // for(int i=1; i<=100; i++){
        //     count=0;
        //     for(int j=0; j<arr.length;j++){
        //         if(i<=arr[j])
        //             count++;
        //         if(count>i)
        //             break;
        //     }
        //     if(count==i)
        //         return i;
        // }
        // return -1;

    }

    static int bSFirstOccurrence(int target, int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target)
                r = mid - 1;
            else if (arr[mid] > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1, arr);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }


    }

    static void swap(int a, int b,int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }



}
