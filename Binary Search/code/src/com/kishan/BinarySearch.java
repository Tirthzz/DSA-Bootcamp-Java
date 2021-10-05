package com.kishan;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = input.nextInt();

        System.out.println(binarySearch(arr,target));

    }

    static int binarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start<=end){
            int mid = start + (end-start) / 2;
            if(target<arr[mid])
                end = mid - 1;
            else if(target>arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

//    static int binarySearch(int[] arr,int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start<=end){
//
////            int mid = (start+end) / 2;
////            when start and end are very close then there sum may exceed the range of int
////            there difference will be very small and will come in the range of int
//            int mid = start + (end-start) / 2;
//            if(target<arr[mid])
//                end = mid - 1;
//            else if(target>arr[mid]) {
//                start = mid+1;
//            }
//            else {
//                //ans found
//                return mid;
//            }
//
//
//        }
//        return -1;
//    }
}
