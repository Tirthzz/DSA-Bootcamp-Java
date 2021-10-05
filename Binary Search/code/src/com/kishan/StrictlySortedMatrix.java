package com.kishan;

import java.util.Arrays;

public class StrictlySortedMatrix {
    public static void main(String[] args) {
        //        n X m   strictly sorted matrix where each row's first element is strictly greater than previous row's last element

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
int target = 12;
        System.out.println(Arrays.toString(bSearch2DSortedArr(arr, target)));

    }

    // search in the row provided between the cols provided
    static int[] bSearchInParticularSection(int row, int cStart, int cEnd, int target, int[][] matrix) {

        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target)
                return new int[]{row, mid};
            else if (matrix[row][mid] > target)
                cEnd = mid - 1;
            else
                cStart = mid + 1;
        }
        return new int[]{-1, -1};
    }

    static int[] bSearch2DSortedArr(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty
        if (cols == 0)
            return new int[]{-1, -1};
        if (rows == 1) {
            return bSearchInParticularSection(0, 0, cols - 1, target, matrix);
        }
        int cMid = cols / 2;
        int rStart = 0;
        int rEnd = rows - 1;
        // run the loop till 2 rows are remaining
        while (rStart != (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] > target) {
                rEnd = mid;
            } else {
                rStart = mid;
            }
        }
        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }

        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }
//        search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return bSearchInParticularSection(rStart, 0, cMid - 1, target, matrix);
        }

//        search in 1st half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return bSearchInParticularSection(rStart, cMid + 1, cols - 1, target, matrix);
        }

//        search in 1st half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return bSearchInParticularSection(rStart + 1, 0, cMid - 1, target, matrix);
        }

//        search in 1st half
        if (target >= matrix[rStart + 1][cMid + 1] && target <= matrix[rStart + 1][cols - 1]) {
            return bSearchInParticularSection(rStart + 1, cMid + 1, cols - 1, target, matrix);
        }


        return new int[]{-1, -1};
    }

}
