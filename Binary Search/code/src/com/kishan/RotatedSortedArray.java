package com.kishan;

public class RotatedSortedArray {
    public static void main(String[] args) {

        int[] nums = {3, 6};//{1};//{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(findPivotRBS(nums));
//        System.out.println(search(nums, target));

    }

    public static int search(int[] nums, int target) {

        int pivotRBS = findPivotRBS(nums);
        if (pivotRBS == -1)
            return binarySearch(nums, target, 0, nums.length - 1);
        if (nums[pivotRBS] == target) {
            return pivotRBS;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivotRBS - 1);
        }
        return binarySearch(nums, target, pivotRBS + 1, nums.length - 1);
    }


    public static int findPivotRBS(int[] nums) {
//        if (nums.length == 1)
//            return 0;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && (nums[mid] > nums[mid + 1]))
                return mid;
            else if (mid > start && (nums[mid] < nums[mid - 1]))
                return mid - 1;
            else if (nums[start] >= nums[mid])
                end = mid - 1;
            else // (nums[start] < nums[mid]) 4 5 6 7 8 9 0 1 2
                start = mid + 1;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

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
        return -1;
    }

    public static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
