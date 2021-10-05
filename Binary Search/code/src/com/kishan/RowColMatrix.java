package com.kishan;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
//        n X m  matrix
        int[][] matrix = {
                {10,20,30,32,33},
                {15,25,35,37,39},
                {25,29,37,39,42},
                {27,34,38,42,45}
        };
//        int target = 27;
        int target = 57;
        System.out.println(Arrays.toString(bSearch2DArray(matrix,target)));
    }
    static int[] bSearch2DArray(int[][] matrix,int target){

        int r = 0;
        int c = matrix[0].length-1;
        while(r<matrix.length && c>=0) {
            if(matrix[r][c]==target)
                return new int[]{r,c};
            if(matrix[r][c]>target)
                c--;
            else
                r++;
        }
        return new int[]{-1,-1};
    }
}
