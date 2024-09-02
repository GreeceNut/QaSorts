package Multiply;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountByTest {
    @Test
    public void fixedTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, CountBy.countBy(1, 10));
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, CountBy.countBy(2, 5));
        assertArrayEquals(new int[]{3, 6, 9, 12, 15, 18, 21}, CountBy.countBy(3, 7));
        assertArrayEquals(new int[]{50, 100, 150, 200, 250}, CountBy.countBy(50, 5));
        assertArrayEquals(new int[]{100, 200, 300, 400, 500, 600}, CountBy.countBy(100, 6));
    }

    @Test
    public void fixedTests4() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, CountBy.countBy4(1, 10));
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, CountBy.countBy4(2, 5));
        assertArrayEquals(new int[]{3, 6, 9, 12, 15, 18, 21}, CountBy.countBy4(3, 7));
        assertArrayEquals(new int[]{50, 100, 150, 200, 250}, CountBy.countBy4(50, 5));
        assertArrayEquals(new int[]{100, 200, 300, 400, 500, 600}, CountBy.countBy4(100, 6));
    }

    @Test
    public void fixedTests2() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, CountBy.countBy2(1, 10));
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, CountBy.countBy2(2, 5));
        assertArrayEquals(new int[]{3, 6, 9, 12, 15, 18, 21}, CountBy.countBy2(3, 7));
        assertArrayEquals(new int[]{50, 100, 150, 200, 250}, CountBy.countBy2(50, 5));
        assertArrayEquals(new int[]{100, 200, 300, 400, 500, 600}, CountBy.countBy2(100, 6));
    }
}
