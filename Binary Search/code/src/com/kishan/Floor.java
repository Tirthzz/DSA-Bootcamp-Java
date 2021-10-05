package com.kishan;

import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 9, 10, 14, 16, 18, 20, 24};

        System.out.print("Enter the target: ");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

//        System.out.println("Floor of the target is: "+arr[floor(arr, target)]);
        System.out.println(floor(arr,target));






    }

    static int floor(int[] arr, int target) {

//        if(target < arr[0])
//            return -1;

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
        return end;
    }
}
