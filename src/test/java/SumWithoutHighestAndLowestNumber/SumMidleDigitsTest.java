package SumWithoutHighestAndLowestNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumMidleDigitsTest {

    @Test
    public void BasicTests() {
        assertEquals(16, SumMidleDigits.sum(new int[]{6, 2, 1, 8, 10}));
        assertEquals(0, SumMidleDigits.sum(null));
    }

}