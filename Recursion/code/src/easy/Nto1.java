package easy;

public class Nto1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + " to " + 1);
        fun(n);
        System.out.println(1 + " to " + n);
        funRev(n);
        System.out.println(n + " to " + 1 + " and " + 1 + " to " + n);
        funBoth(n);
    }

    private static void fun(int i) {
        if (i == 0) {
            return;
        }
        System.out.println(i);
        fun(i - 1);
    }

    private static void funRev(int i) {
        if (i == 0) {
            return;
        }
        funRev(i - 1);
        System.out.println(i);
    }

    private static void funBoth(int i) {
        if (i == 0) {
            return;
        }
        System.out.println(i);
        funBoth(i - 1);
        System.out.println(i);
    }
}
