package SumWithoutHighestAndLowestNumber;

import java.util.Arrays;

import static java.util.stream.IntStream.of;

/**
 * Task
 * Sum all the numbers of a given array ( cq. list ),
 * except the highest and the lowest element ( by value, not by index!).
 * <p>
 * The highest or lowest element respectively is a single element at each edge,
 * even if there are more than one with the same value.
 * <p>
 * Mind the input validation.
 * <p>
 * Example
 * { 6, 2, 1, 8, 10 } => 16
 * { 1, 1, 11, 2, 3 } => 6
 * Input validation
 * If an empty value ( null, None, Nothing etc. ) is given instead of an array,
 * or the given array is an empty list or a list with only 1 element, return 0.
 */
public class SumMidleDigits {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return 0;
        }
        int sum = 0;
        Arrays.sort(numbers);
        for (int number : numbers) {
            sum += number;
        }
        return sum - numbers[0] - numbers[numbers.length - 1];
    }

    public static int sum1(int[] numbers) {
        return (numbers == null || numbers.length <= 2) ? 0
                : of(numbers).sum()
                - of(numbers).max().getAsInt()
                - of(numbers).min().getAsInt();
    }
}
