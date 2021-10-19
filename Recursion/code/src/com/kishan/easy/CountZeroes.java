package easy;

public class CountZeroes {
    static int count;

    public static void main(String[] args) {
        int n = 707070070;
        System.out.println("noOfZeroes");
        noOfZeroes(n);
        System.out.println(count);
        System.out.println("noOfZeroes2");
        System.out.println(noOfZeroes2(n));

    }

    private static void noOfZeroes(int n) {
        if (n < 10)
            return;
        if (n % 10 == 0)
            count++;
        noOfZeroes(n / 10);
    }

    private static int noOfZeroes2(int n) {
        return helper(n, 0);
    }

    // special pattern, how to pass a value to above calls
    private static int helper(int n, int count) {
        if (n < 10)
            return count;
        if (n % 10 == 0)
            count++;
        return helper(n / 10, count);
    }
}
