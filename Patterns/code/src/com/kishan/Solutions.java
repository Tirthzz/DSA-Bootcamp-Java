package com.kishan;

public class Solutions {

    public static void main(String[] args) {
        int n = 4;
        pattern31rawVersion(n);
        System.out.println();
        pattern31(n);
    }

    static void pattern31(int n) {
        int N = 2*n;
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-1; j++) {

                int atEveryIndex = minValue(i,N-2-i,N-2-j,j);
                System.out.print(n-atEveryIndex+" ");

            }
            System.out.println();
        }

    }

    static void pattern31rawVersion(int n) {
        int N = 2*n;
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-1; j++) {

                int atEveryIndex = minValue(i,N-2-i,N-2-j,j);
                System.out.print(atEveryIndex+" ");

            }
            System.out.println();
        }

    }

    static int minValue(int up,int down,int left,int right){
        return Math.min(Math.min(up,down),Math.min(left,right));
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2*n-1; row++) {

            int c = row <= n ? row : 2 * n - row;

            for (int spaces=1;spaces <= n - c; spaces++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col+" ");
            }
            System.out.println();

        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();

        }
    }

    static void pattern28onPattern5(int n) {

        for (int row = 1; row <= 2 * n - 1; row++) {

            int totalColInRow = row <= n ? row : 2 * n - row;
//            int spaces = row <= n ? n-row : row-n;
            int spaces = n - totalColInRow;

            for (int col = 1; col <= spaces; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {

        for (int row = 1; row <= 2 * n - 1; row++) {

            int start, stop;
            if (row <= n) {
                start = n - row + 1;
                stop = start + row - 1;
            } else {
                start = row - n + 1;
                stop = start + 2 * n - row - 1;
            }

            for (int col = 1; col <= stop; col++) {
                if (col >= start)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {

        for (int row = 1; row <= 2 * n - 1; row++) {

            int totalColInRow = row <= n ? row : 2 * n - row;
//            if(row<=n) totalColInRow=row;
//            else totalColInRow = 2*n-row;

            for (int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static void pattern3(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
