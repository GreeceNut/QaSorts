package HowGoodAreYouReally;

import java.util.Arrays;

public class WhoIsBetter {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = Arrays.stream(classPoints).sum() / classPoints.length;
        if (sum >= yourPoints) {
            return false;
        }
        return true;
    }
}
