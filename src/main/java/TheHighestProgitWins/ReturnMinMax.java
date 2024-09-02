package TheHighestProgitWins;

import java.util.Arrays;

public class ReturnMinMax {
    /**
     * Story
     * Ben has a very simple idea to make some profit:
     * he buys something and sells it again.
     * Of course, this wouldn't give him any profit at all if he was simply to buy and sell it at the same price.
     * Instead, he's going to buy it for the lowest possible price and sell it at the highest.
     * <p>
     * Task
     * Write a function that returns both
     * the minimum and maximum number of the given list/array.
     * <p>
     * Remarks
     * All arrays or lists will always have at least one element,
     * so you don't need to check the length.
     * Also, your function will always get an array or a list,
     * you don't have to check for null, undefined or similar.
     */
    public static int[] minMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return new int[]{min, max};
    }

    public static int[] minMax2(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
    }
}

