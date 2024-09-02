package ReversedArray;

import java.util.*;

/**
 * Given a random non-negative number,
 * you have to return the digits of this number
 * within an array in reverse order.
 */

public class ReversedArray {
    public static int[] digitize(long n) {

        /** Создаем тип String, который можно менять — StringBuilder
         / .reverse — для реверса значений String
         */
        StringBuilder z = new StringBuilder(String.valueOf(n)).reverse();
        /** Возвращаем Arrays.stream, то есть массив с параметрами
         / .toArray — для реверса значений String
         */

        return Arrays.stream(z.toString().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();


    }

    public static int[] digitize2(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    /**
     * Complete the solution so that it reverses the string passed into it.
     * <p>
     * 'world'  =>  'dlrow'
     * 'word'   =>  'drow'
     */
    public static String reverse(String str) {
        return String.valueOf(new StringBuilder(str).reverse());
    }
}

