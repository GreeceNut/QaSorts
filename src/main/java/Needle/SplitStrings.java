package Needle;

import java.util.*;

public class SplitStrings {

    /**
     * Can you find the needle in the haystack?
     * <p>
     * Write a function findNeedle() that takes an array full of junk but containing one "needle"
     * <p>
     * After your function finds the needle it should return a message (as a string) that says:
     * <p>
     * "found the needle at position " plus the index it found the needle, so:
     */
    public static String findNeedle(Object[] haystack) {
        String needle = "needle";

        for (int i = 0; i < haystack.length; i++) {
            if (needle.equals(haystack[i])) {
                return String.format("found the needle at position " + i);
            }
        }
        return String.valueOf(-1);
    }

    public static String findNeedle2(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}