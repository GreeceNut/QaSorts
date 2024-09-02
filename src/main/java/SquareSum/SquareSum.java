package SquareSum;

public class SquareSum {
    public static int squareSum(int[] n) {
        double sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += Math.pow(n[i], 2);
        }
        return (int) sum;
    }
}
