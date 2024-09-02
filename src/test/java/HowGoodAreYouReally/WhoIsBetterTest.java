package HowGoodAreYouReally;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhoIsBetterTest {
    @Test
    public void tests() {
        assertTrue(WhoIsBetter.betterThanAverage(new int[]{2, 3}, 5));
        assertTrue(WhoIsBetter.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertTrue(WhoIsBetter.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertFalse(WhoIsBetter.betterThanAverage(new int[]{100, 90}, 11));
    }
}