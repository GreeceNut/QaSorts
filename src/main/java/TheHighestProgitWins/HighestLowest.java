package TheHighestProgitWins;

import java.util.Arrays;

import static java.util.Arrays.stream;

/**
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 *
 * Examples
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 * Notes
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 */
public class HighestLowest {
    public static String highAndLow(String numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = numbers.split(" ");
        int[] intArr = stream(arr).mapToInt(Integer :: parseInt).toArray();
        Arrays.sort(intArr);
        stringBuilder.append(intArr[intArr.length-1]).append(" ").append(intArr[0]);
        return stringBuilder.toString();
    }
        static String highAndLow2(String numbers) {
            var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
            return stats.getMax() + " " + stats.getMin();
        }
}

