package CountPositiveSumNegative;

/**
 * Given an array of integers.
 * Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
 * If the input is an empty array or is null, return an empty array.
 */
public class CountPositivesSumNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int plusNumber = 0;
        int sumMinus = 0;
        for (int item : input) {

            if (item > 0)
                plusNumber++;

            if (item < 0)
                sumMinus += item;

        }
        return new int[]{plusNumber, sumMinus};
    }

}
