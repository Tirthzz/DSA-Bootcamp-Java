package com.kishan;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (m > 0 && n > 0) {
            if (nums1[j] <= nums2[k]) {
                arr[i] = nums1[j];
                i++;
                j++;
                m--;
            } else {
                arr[i] = nums2[k];
                i++;
                k++;
                n--;
            }
        }
        if (m == 0) {
            while (n-- != 0) {
                arr[i] = nums2[k];
                i++;
                k++;
            }
        } else {
            while (m-- != 0) {
                arr[i] = nums1[j];
                i++;
                j++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            nums1[i] = arr[i];
        }
    }
}
