package com.kishan;

import java.util.Arrays;

public class Leetcode977 {
    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
            if (nums[max] < nums[i])
                max = i;
        }
        int[] idxArr = new int[nums[max] + 1];
        for (int num : nums) {
            idxArr[num]++;
        }

        int[] ans = new int[n];
        int j = 0;
        for (int i = 0; i < nums[max] + 1; i++) {
            if (idxArr[i] > 0) {
                while (idxArr[i]-- != 0) {
                    ans[j] = i;
                    j++;
                }

            }
        }

        return ans;


        // Arrays.sort(nums);


        // return nums;
    }
}
