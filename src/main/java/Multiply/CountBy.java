package Multiply;

import java.util.stream.IntStream;

/**
 * Create a function with two arguments that will return an array of the first n multiples of x.
 * /
 * /        Assume both the given number and the number of times to count will be positive numbers greater than 0.
 * /
 * /        Return the results as an array or list ( depending on language ).
 */
public class CountBy {
    public static int[] countBy(int x, int n) {
        int[] z = new int[n];
        for (int i = 0; i < n; i++) {
            if ((i * x) % x == 0) {

                z[i] = (i + 1) * x;
            }
        }
        return z;
    }


    public static int[] countBy2(int x, int n) {
        return IntStream.iterate(x, it -> it + x).limit(n).toArray();
    }

    public static int[] countBy3(int x, int n) {

        return IntStream.rangeClosed(1, n)
                .map(i -> i * x)
                .toArray();
    }

    public static int[] countBy4(int x, int n) {
        int[] result = new int[n];
        int j = 0;
        for (int i = 1; j < n; i++) {
            if (i % x == 0) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }

}
