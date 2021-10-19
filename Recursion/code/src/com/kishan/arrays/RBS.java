package com.kishan.arrays;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 0, 1, 2, 3, 4};
        int target = 7;
        System.out.println(rbs(arr, target, 0, arr.length - 1));
    }

    private static int rbs(int[] arr, int target, int s, int e) {
        if (s > e)
            return -1;
        int m = s + (e - s) / 2;
        if (arr[m] == target)
            return m;

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return rbs(arr, target, s, m - 1);
            } else {
                return rbs(arr, target, m + 1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return rbs(arr, target, m + 1, e);
        }

        return rbs(arr, target, s, m - 1);

//        if (arr[s] <= arr[m]) {
//            if (target < arr[m])
//                return rbs(arr, target, s, m - 1);
//            else
//                return rbs(arr, target, m + 1, e);
//        }
//        if (target < arr[m])
//            return rbs(arr, target, s, m - 1);
//        else
//            return rbs(arr,target,m+1,e);

    }

}
