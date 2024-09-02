package CountSheep;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * If you can't sleep, just count sheep!!
 * Task:
 * Given a non-negative integer, 3 for example,
 * return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
 * Input will always be valid, i.e. no negative integers.
 */
public class CountSheep {
    public static String countingSheep(int num) {
        if (num == 0) {
            return "";
        }
        String sheeps = "";
        if (num < 1) {
            sheeps = "no sheep";
            System.out.println(sheeps);
            return sheeps;
        }
        for (int i = 1; i <= num; i++) {
            sheeps += i + " sheep...";
            System.out.println(sheeps);
        }
        return sheeps;
    }

    public static String countingSheep1(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            stringBuilder.append(i).append(" sheep...");
        }
        return stringBuilder.toString();
    }

    public static String countingSheep2(int num) {
        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining());
    }

}