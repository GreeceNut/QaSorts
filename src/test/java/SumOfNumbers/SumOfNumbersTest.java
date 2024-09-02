package SumOfNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfNumbersTest {

    SumOfNumbers s = new SumOfNumbers();

    @Test
    public void Test1() {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }

    @Test
    public void TestB() {
        assertEquals(-1, s.GetSum2(0, -1));
        assertEquals(1, s.GetSum2(0, 1));
    }

}