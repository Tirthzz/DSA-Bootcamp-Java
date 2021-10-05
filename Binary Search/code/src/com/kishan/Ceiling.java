package com.kishan;

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 9, 10, 14, 16, 18, 20, 24};

        System.out.print("Enter the target: ");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

//        System.out.println("Ceiling of the target is: "+arr[ceiling(arr, target)]);
        System.out.println(ceiling(arr, target));

    }

    static int ceiling(int[] arr, int target) {

//        if (target > arr[arr.length - 1]) {
//            return -1;
//        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }


        }

        if (target > arr[arr.length - 1]) {
            return start - arr.length - 1;
//            return start;
        }

        return start;
    }
}
