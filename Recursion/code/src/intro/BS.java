package intro;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9, 12, 15, 24, 27, 32, 45, 60, 73};
        int target = 32;
        System.out.println(bSearch(arr, target, 0, arr.length - 1));
    }

    static int bSearch(int[] arr, int target, int s, int e) {
        if (s > e)
            return -1;
        int mid = s + (e - s) / 2;
        if (arr[mid] == target)
            return mid;
        if (target < arr[mid])
            return bSearch(arr, target, s, mid - 1);
        return bSearch(arr, target, mid + 1, e);
    }
}
