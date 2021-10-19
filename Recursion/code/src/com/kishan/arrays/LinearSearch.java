package arrays;

import java.util.ArrayList;

public class LinearSearch {
    static ArrayList<Integer> ls = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 10, 9, 11, 10, 101, 99, 10, 200};
        int target = 10;
//        System.out.println("Target found: " + find(arr, 0, target));
//        System.out.println("Target found at Index: " + findIndex(arr, 0, target));
//        System.out.println("Target found from Last at Index: " + findLastIndex(arr, arr.length - 1, target));
//        findAllIndex(arr, 0, target);
//        System.out.println(list);

//        ArrayList<Integer> ans1 = findAllIndex(arr, 0, target, new ArrayList<>());
//        System.out.println(ans1);
//
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex(arr, 0, target, list);
//        System.out.println(ans);
//        System.out.println(list);

        System.out.println(findAllIndex2(arr, 0, target));


    }

    private static ArrayList<Integer> findAllIndex2(int[] arr, int index, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length)
            return list;
        // this will contain answer for that function call only
        if (arr[index] == target)
            list.add(index);
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, index + 1, target);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    private static ArrayList<Integer> findAllIndex(int[] arr, int index, int target, ArrayList<Integer> list) {
        if (index == arr.length)
            return list;
        if (arr[index] == target)
            list.add(index);
        return findAllIndex(arr, index + 1, target, list);
    }


    private static void findAllIndex(int[] arr, int index, int target) {
        if (index == arr.length)
            return;
        if (arr[index] == target)
            ls.add(index);
        findAllIndex(arr, index + 1, target);
    }

    private static boolean find(int[] arr, int index, int target) {
        if (index == arr.length)
            return false;
        return arr[index] == target || find(arr, index + 1, target);
    }

    private static int findIndex(int[] arr, int index, int target) {
        if (index == arr.length)
            return -1;
        if (arr[index] == target)
            return index;
        return findIndex(arr, index + 1, target);
    }

    private static int findLastIndex(int[] arr, int index, int target) {
        if (index == -1)
            return -1;
        if (arr[index] == target)
            return index;
        return findLastIndex(arr, index - 1, target);
    }


}
