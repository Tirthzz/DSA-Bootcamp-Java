package com.kishan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        //        "Hello".sout  // another shortcut to print a message

//        1-flow-of-program.md

//        Q1 Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        Scanner input = new Scanner(System.in);
        int sum = 0;
        String str;
        while (true) {
            str = input.next();
            if (str.equals("X") || str.equals("x")) {
                break;
            } else {
                sum += Integer.parseInt(str);
            }
        }
        System.out.println("Sum = " + sum);

        // 10 Check if the Sentence Is Pangram

        String sentence = "bcdefghijklmnopqrstuvwxyaz";
        System.out.println("String sentence length = "+sentence.length());

        int it = 'y';
//        char ch = 1+a;
        char ch = (char) (1 + it);

        System.out.println(sentence.indexOf(ch - 1));
        System.out.println(sentence.indexOf(it + 1));

        if (sentence.length() < 26) {
            System.out.println(false);
        }

        for (int i = 1; i <= 26; i++) {

            System.out.println(sentence.indexOf((char) i + 96));

            if (sentence.indexOf((char) i + 96) < 0) {
                System.out.println(false);
            }

        }

        System.out.println(true);

//        Enhanced For-Loop in brief
        int[] a = {1, 2, 3};

        for (int i : a) {
            i = -1;
//            a[j++] = i; // this statement makes a lot of difference in the output and helps understand for-each loop better
        }
        System.out.println(Arrays.toString(a));

        System.out.println(oddCells(2, 3, new int[][]{{0, 1}, {1, 1}}));

        System.out.println(diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));

    }

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            ans[i] = nums[nums[i]];

        }
        return ans;
    }

    static int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {

            ans[i] = ans[i + nums.length] = nums[i];

        }
        return ans;
    }

    static int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;

    }

    static int maximumWealth(int[][] accounts) {
        int max = 0, sum;
        for (int[] account : accounts) {

            sum = 0;

            for (int i : account) {

                sum += i;

            }

            max = Math.max(max, sum);

        }
        return max;
    }

    static int[] shuffle(int[] nums, int n) {

        int[] res = new int[2 * n];
        for (int i = 0, j = n, idx = 0; idx < res.length; i++, j++) {
            res[idx++] = nums[i];
            res[idx++] = nums[j];
        }
        return res;

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> result = new ArrayList<>(candies.length);

        int max = candies[0];

        for (int i = 1; i < candies.length; i++) {

            max = Math.max(max, candies[i]);

        }


//        for optimization purpose
        max -= extraCandies;

        for (int candy : candies)
            result.add(candy >= max);
//            result.add(candy + extraCandies >= max);


        return result;

    }

    static int numIdenticalPairs(int[] nums) {

//        Hint: Count how many times each number appears. If a number appears n times, then n * (n – 1)/2 good pairs can be made with this number.

        int res = 0;
        int[] count = new int[101];
        for (int a : nums) {
            res += count[a]++;
        }
        return res;

//        int answer = 0;
//        int[] freq = new int[102];
//
//        for (int i : nums) {
//            if (freq[i] == 0) freq[i]++;
//            else{
//                answer += freq[i];
//                freq[i]++;
//            }
//        }
//        return answer;

    }

    static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] freq = new int[Arrays.stream(nums).max().getAsInt() + 1];

        for (int num : nums) {
            freq[num]++;
        }

        // Implementation of Running Sum Array
        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                nums[i] = 0;
            else
                nums[i] = freq[nums[i] - 1];
        }
        return nums;

        // you wont need to have any if condition as earlier used because you hv initially kept the size of array as **** 102 ****
//        int[] bucket = new int[102]; //very imp line ****102****
//        for(int i=0; i<nums.length; i++)
//            bucket[nums[i]+1]++;
//
//        for(int i=0; i<101; i++)
//            bucket[i+1] += bucket[i];
//
//        for(int i=0; i<nums.length; i++)
//            nums[i] = bucket[nums[i]];
//
//        return nums;

//        int[] bucket = new int[102];
//        for(int i=0; i<nums.length; bucket[nums[i]+1]++, i++);
//        for(int i=0; i<101; bucket[i+1] += bucket[i], i++);
//        for(int i=0; i<nums.length; nums[i] = bucket[nums[i]], i++);
//        return nums;

    }

    static int[] createTargetArray(int[] nums, int[] index) {

        //https://leetcode.com/problems/create-target-array-in-the-given-order/discuss/547562/Java-Solution-with-Shift-Elements
        // Arrays.fill(result, -1);

//        int[] target = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            insertInArray(target,index[i],nums[i]);
//        }
//        return target;
        ArrayList<Integer> targetlist = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            targetlist.add(index[i], nums[i]);
        }
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            target[i] = targetlist.get(i);
        }
        return target;
    }

//    static void insertInArray(int[] target, int idx, int val){
//        for (int j = target.length - 1; j > idx; j--) {
//            target[j] = target[j - 1];
//        }
//        target[idx] = val;
//    }

    static boolean checkIfPangram(String sentence) {

        if (sentence.length() < 26)
            return false;

        int[] arr = new int[123];

        int i = 0;
        while (i < sentence.length()) {
            arr[sentence.charAt(i)]++;
            i++;
        }
        for (int j = 97; j < arr.length; j++) {
            if (arr[j] == 0)
                return false;
        }

        return true;

//        boolean[] letters  = new boolean[26];
//
//        for(char c : sentence.toCharArray()) {
//            letters[c - 'a'] = true;
//        }
//
//        //find any letter that not exist
//        for(boolean existLetter : letters) {
//            if(!existLetter) return false;
//        }
//
//        return true;
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int idx, count = 0;

//        if (ruleKey.equals("type")) idx=0;
//        else if (ruleKey.equals("color")) idx=1;
//        else idx=2;

        idx = ruleKey.equals("type") ? 0 : (ruleKey.equals("color") ? 1 : 2);

        for (List<String> item : items) {
            if (item.get(idx).equals(ruleValue))
                count++;

        }
        return count;
    }

    static int largestAltitude(int[] gain) {

        int currAlt = 0;
        int maxAltPt = 0;
        for (int j : gain) {
            currAlt = currAlt + j;
            maxAltPt = Math.max(currAlt, maxAltPt);
        }
        return maxAltPt;

    }

    static int[][] flipAndInvertImage(int[][] image) {

        // base case
        if (image == null || image[0].length != image.length) return null;

        // remember it's a 2X2 Matrix
        // So n = image.length = image[i].length
//        int n = image.length;
//        for (int[] row : image) {
//            for (int i = 0; i * 2 < n; i++)
//                if (row[i] == row[n - i - 1])
////                    row[i] = row[n - i - 1] ^= 1;
//                    row[i] = row[n - i - 1] = 1 - row[n - i - 1];
//
////                there is  a difference between (((i < n/2))) and ((( i * 2 < n   i < (Math.ceil(0.5 * n))   i < (n / 2 + n % 2)   (i < (image[0].length+1)/2) )))[Just think about it]
//
//        }
//        return image;
        int n = image.length;
        for (int[] row : image) {
            for (int j = 0; j * 2 < n; j++) {
                int tmp = row[j];
                row[j] = row[n - 1 - j] ^ 1;
                row[n - 1 - j] = tmp ^ 1;
            }
        }
        return image;
    }

    static int oddCells(int m, int n, int[][] indices) {

//        int[][] matrix = new int[m][n];

//        for(int[] row : matrix){
//            Arrays.fill(row,0);
//        }
//        for(int[] row : matrix){
//            System.out.println(Arrays.toString(row));
//        }

        int count = 0;
        int[] row = new int[m];
        int[] col = new int[n];
        for (int[] x : indices) {
            row[x[0]]++;
            col[x[1]]++;
        }
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 != 0)
                    count++;
            }
        return count;


    }

    static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {
                if (j == i || j == n - i - 1) {
                    sum += mat[i][j];
                }
            }
            for (int j = n - i - 1; j <= i; j++) {
                if (j == n - i - 1 || j == i) {
                    sum += mat[i][j];
                }
            }
        }

        if (n % 2 == 0) {
            return sum;
        } else
            return sum - mat[n / 2][n / 2];

//            for(int[] row: mat){
//                System.out.println(Arrays.toString(row));
//            }
    }

    static int findNumbers(int[] nums) {

//        int count = 0;
//        for(int num : nums){
//            if (num < 0)
//                num*=-1;
//            String str = num + "";
//            if(str.length()%2==0){
//                count++;
//            }
//        }
//        return count;
        int count = 0;
        for (int num : nums) {
            if (num < 0)
                num *= -1;
            if ((int) (Math.log10(num)) + 1 % 2 == 0) {
                count++;
            }
        }
        return count;
    }


}