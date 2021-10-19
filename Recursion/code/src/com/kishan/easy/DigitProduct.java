package easy;

public class DigitProduct {
    public static void main(String[] args) {
        int n = 1245;
        System.out.println(prodOfDig(n));
    }

    private static int prodOfDig(int n) {
        if (n < 10)
            return n;
        return n % 10 * prodOfDig(n / 10);
    }
}
