package COM.RAJAT.day44;

public class RecursiveSum {
    public static int RecSum(int n) {
        if (n == 0) return 0;
        return n + RecSum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(RecSum(10));
    }
}